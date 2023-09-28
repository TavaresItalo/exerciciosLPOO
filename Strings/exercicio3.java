package Strings;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();
        String numeroString = String.valueOf(numero);
        System.out.println("O número é " + numeroString);
    }
    
}
