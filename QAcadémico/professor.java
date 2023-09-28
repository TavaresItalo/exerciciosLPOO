package QAcadémico;

import java.util.Scanner;

public class professor {
    String nome;
    String cpf;
    String disciplina;
    int[] notas = new int[4];
    Scanner leitor = new Scanner(System.in);

    public professor(String nome, String cpf, String disciplina) {
        this.cpf = cpf;
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void LançarNotas(alunos aluno) {
        for(int i = 0; i < 4; i++) {
            System.out.println("Digite a nota da " + (i + 1) + " unidade: ");
            notas[i] = leitor.nextInt();
            aluno.setNotas(notas);
        }
    }

    public double CalculaMedia(alunos aluno) {
        double media;
        int soma = 0;
        notas = aluno.getNotas();

        for(int i = 0; i < 4; i++) {
            soma = soma + notas[i] ;
        }
        media = soma / 4;
        return media;
    }

    public void ExibeNotas() {
        for(int i = 0; i < 4; i++) {
            System.out.println("Nota da " + (i + 1) + " unidade" + notas[i]);
        }

    }

    public String getDisciplina() {
        return disciplina;
    }
}


