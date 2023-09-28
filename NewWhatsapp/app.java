package NewWhatsapp;

public class app {
    public static void main(String[] args) {
        contato pikachu = new contato("00000000", "Pikachu");
        contato blastoise = new contato("11111111", "Blastoise");

        pikachu.enviarMensagem(blastoise, 1);
        blastoise.exibirQtsMensagens();

        pikachu.enviarMensagem(blastoise, 5);
        blastoise.exibirQtsMensagens();
    }
}
