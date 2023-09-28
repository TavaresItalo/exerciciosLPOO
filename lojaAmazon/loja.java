package lojaAmazon;

public class loja {
    public static void main(String[] args) {
        produto produto01 = new produto(199.9, "Tênis Adidas", 10);
        cliente cliente01 = new cliente("Ítalo", "0001111000");
        cliente cliente02 = new cliente("Pikachu", "123456789");

        produto01.exibirProduto();

        cliente01.comprarProduto(produto01, 1);

        produto01.exibirEstoque();

        cliente02.comprarProduto(produto01, 1);
        
        produto01.exibirEstoque();

        cliente01.comprarProduto(produto01, 9);

        produto01.exibirEstoque();

        cliente02.comprarProduto(produto01, 8);

        produto01.exibirEstoque();

    }
}
