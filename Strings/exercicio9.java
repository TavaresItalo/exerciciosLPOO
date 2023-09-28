package Strings;
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o primeiro nome: ");
        String nome1 = leitor.nextLine();
        nome1 = nome1.trim();

        System.out.print("Digite o segundo número: ");
        String nome2 = leitor.nextLine();
        nome2 = nome2.trim();
        
        int valor = nome1.compareTo(nome2);

        if(valor > 0) {
            System.out.print(nome2 + " " + nome1);
        } else if (valor < 0) {
            System.out.print(nome1 + " " + nome2);
        } else if (valor == 0) {
            System.out.print("Os nomes são iguais");
        }

    }
}

