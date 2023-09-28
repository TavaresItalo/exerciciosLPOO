package Strings;

import java.util.Scanner ;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome1 = leitor.next();
        System.out.print("Digite outro nome: ");
        String nome2 = leitor.next();
        
        Boolean comparacao = nome1.equalsIgnoreCase(nome2);

        if(comparacao) {
            System.out.println("Os nomes são iguais");
        } else {
            System.out.println("Os nomes não são iguais");
        }
}
}