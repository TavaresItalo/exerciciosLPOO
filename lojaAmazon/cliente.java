package lojaAmazon;

public class cliente {
    String nome;
    String cpf;

    public cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void comprarProduto(produto produto, int quantidade) {
        if(produto.getQtdDisponivel() >= quantidade) {
        produto.diminuirEstoque(quantidade);
        double valorCompra = produto.getPreco() * quantidade;
        
        System.out.println("Você efetuou a compra de " + quantidade + " " 
        + produto.getNome() + ".");
        
        System.out.println("O total da compra foi de: " + valorCompra);
        System.out.println(this.getNome() + ", obrigado por comprar nossos produtos!");
        } 
        else if(produto.getQtdDisponivel() < quantidade){
        System.out.println("Quantidade não disponível em estoque ");
        }
        System.out.println("============================================");
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

}
