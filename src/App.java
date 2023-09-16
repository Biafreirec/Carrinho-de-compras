public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Feijão", 5.50 , 1);
        carrinho.adicionarItem("Arroz", 3.99, 2);
        carrinho.adicionarItem("Café", 7.99, 2);

        System.out.println("O valor total do carrinho é: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Café");
        System.out.println("O valor total do carrinho é: " + carrinho.calcularValorTotal());

        carrinho.exibirItens();

    }
}
