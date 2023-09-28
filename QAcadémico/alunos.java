package QAcadémico;

public class alunos {
    String nome;
    String cpf;
    String matricula;
    int[] notas = new int[4];
   

    public alunos(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public void ExibeNotas() {
        for(int i = 0; i < 4; i++) {
            System.out.println("Nota da " + (i + 1) + " unidade: " + notas[i]);
        }
    }

    public void ExibeMedia(alunos aluno, professor professor) {
        System.out.println("Media de " + professor.getDisciplina() + ": " 
        + professor.CalculaMedia(aluno) );
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int[] getNotas() {
        return notas;
    }
    
    
}
