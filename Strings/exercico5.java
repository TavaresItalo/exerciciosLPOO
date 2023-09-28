package Strings;
import java.util.Scanner;

public class exercico5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String senha = "eu amo programar";
        
        System.out.print("Digite a senha de acesso: ");
        String senhaDigitada = leitor.nextLine();
        senhaDigitada = senhaDigitada.trim();

        Boolean comparacao = senha.equals(senhaDigitada);
        
        if (comparacao) {
            System.out.print("Acesso Liberado.");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
    
}
