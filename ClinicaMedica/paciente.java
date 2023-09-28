package ClinicaMedica;

public class paciente {
   private String codigo;
    String nome;
    String dataNascimento;
    String sexo;
    String planoSaude;
    String alergia;
    String tipoSanguineo;
  
    public paciente(String codigo, String nome, String dataNasc, String sexo, String tipoSang ) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNasc;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSang;     
    }

    void ImprimeAtributos(){
        System.out.println("Nome: " + nome);
        System.out.println("Codigo " + codigo);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Plano de saúde:  " + planoSaude);
        System.out.println("Alergias: " + alergia);
        System.out.println("Tipo Sanguineo: " + tipoSanguineo);
    }

    void ModificaAtributos(String codigo, String nome, String dataNasc, String sexo, String alergia, String planoSaude, String tipoSang ) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNasc;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSang;  
    }
}
