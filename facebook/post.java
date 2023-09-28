package facebook;

public class post {
    String texto;
    String link;
    int numeroCurtidas = 0 ;
    int numeroCompartilhamento = 0;

    public post(String texto, String link) {
        this.texto = texto;
        this.link = link;
    }

    void curtir() {
        numeroCurtidas++;
    }

    void compartilhar() {
        numeroCompartilhamento++;
    }

    void engajamento(post post) {
        System.out.println("===Engajamento===");
        System.out.println("Curtidas: " + post.getNumeroCurtidas());
        System.out.println("Compartilhamentos: " + post.getNumeroCompartilhamento());
    }

    public int getNumeroCompartilhamento() {
        return numeroCompartilhamento;
    }
    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
