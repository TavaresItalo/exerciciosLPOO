package ClinicaMedica;

public class medico {
    private int codigo;
    String nome;
    String sexo;
    String especialidade;
    endereco endereco;

    public medico(int codigo,String nome,String sexo,
    String especialidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
    }

    void ImprimeAtributosMedico() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("-----Endereço-----");
        endereco.ImprimeEndereco();
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
