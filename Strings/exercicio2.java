package Strings;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o titulo do livro: ");
        String titulo = leitor.next();

        if(titulo.length() > 20 ) {
            System.out.print("Título acima do permitido");
        } else {
            System.out.print("Título encontrado.");
        }
    }
    
}
