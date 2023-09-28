package NewWhatsapp;

public class contato {
    String numero;
    String nome;
    int numMensagens;
    
    public contato(String numero, String nome) {
        this.nome = nome;
        this.numero = numero;
    }

    public void enviarMensagem(contato contato, int qtdmensagens) {
        contato.incrementarMensagens(qtdmensagens);
    }

    public void incrementarMensagens(int qtdmensagens) {
        this.numMensagens = this.getnumMensagens() + qtdmensagens;
    }

    public void exibirQtsMensagens() {
        System.out.println(this.getNome() +" você posssui "+ this.getnumMensagens() 
        + " mensagens não lidas");
    }

    public int getnumMensagens() {
        return numMensagens;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

}
