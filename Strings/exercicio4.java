package Strings;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o ano de início do seu curso: ");
        String anoInicio = leitor.next();
        System.out.print("Digite a duração do seu curso: ");
        String duracaoCurso = leitor.next();

        int int_ano_inicio = Integer.parseInt(anoInicio);
        int int_duracao_curso = Integer.parseInt(duracaoCurso);
        int anoConclusao = int_ano_inicio + int_duracao_curso;

        System.out.println("O ano de conclusão será em " + anoConclusao);
    }
}
