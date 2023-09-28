package facebook;

public class aplicacao {
    public static void main(String[] args) {
        post novoPost = new post("Prazer imenso passar o mês na PV.", 
        "https://brunocartaxo.com/teaching/ifpe/paulista/ads/lpoo");

        for(int i = 0; i < 20; i++) {
            novoPost.curtir();
        }

        System.out.println("O número de curtidas é: " 
        + novoPost.getNumeroCurtidas());
        
        for(int i = 0; i < 10; i++) {
            novoPost.compartilhar();
        }
        

        System.out.println("O número de compartilhamentos é: " 
        + novoPost.getNumeroCompartilhamento());

        novoPost.engajamento(novoPost);

    }
}
