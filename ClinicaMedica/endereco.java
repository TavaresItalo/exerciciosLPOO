package ClinicaMedica;

public class endereco {
    String rua;
    int numero;
    String bairro;
    String complemento;
    String cidade;
    String uf;
    String cep;

    public endereco(String rua, int numero, String bairro,
    String cep,String cidade,String uf,String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
    }

    public void ImprimeEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("UF: " + uf);
        System.out.println("Complemento: " + complemento);

    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

}