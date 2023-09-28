package Strings;
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome e sobronome: ");
        
        String nomeCompleto = leitor.nextLine();
        nomeCompleto = nomeCompleto.trim();
        
        int tamanhoNome = nomeCompleto.indexOf(" ");
        
        String primeiroNome = nomeCompleto.substring(0, tamanhoNome);

        System.out.print("O primeiro nome é " + primeiroNome);
    }
}
