package lojaAmazon;

public class produto {
    double preco;
    String nome;
    int qtdDisponivel;

    public produto(double preco, String nome, int qtdDisponivel) {
        this.nome = nome;
        this.preco = preco;
        this.qtdDisponivel = qtdDisponivel; 
    }

   public void  diminuirEstoque(int qtdProdutosComprados) {
        this.qtdDisponivel = this.getQtdDisponivel() - qtdProdutosComprados;
   }

   public void exibirEstoque() {
    if (this.getQtdDisponivel() > 0) {
    System.out.println("Produto: " + this.getNome());
    System.out.println("Estoque disponível: " + this.getQtdDisponivel());
    } else {
    System.out.println("Estoque zerado.");
    }
    System.out.println("===========");
   }

   public void exibirProduto() {
    System.out.println("Produto: " + this.getNome());
    System.out.println("Preço: " + this.getPreco());
    System.out.println("===========");
   }

   public String getNome() {
       return nome;
   }

   public double getPreco() {
       return preco;
   }

   public int getQtdDisponivel() {
       return qtdDisponivel;
   }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
