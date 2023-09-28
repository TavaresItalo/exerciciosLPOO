package Strings;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o título do filme: ");
        String titulo = leitor.nextLine();
        titulo = titulo.toUpperCase();

        System.out.print("Você escolheu o filme: " + titulo);
    }
    
}
