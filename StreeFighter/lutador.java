package StreeFighter;

public class lutador {
    String nome;
    int energia;
    int força;

    public lutador(String nome, int energia, int força) {
        this.nome = nome;
        this.energia = energia;
        this.força = força;
    }

    void aplicarGolpe(lutador lutador) {
       int dano = lutador.getEnergia() - força;

       lutador.setEnergia(dano);

       System.out.println("O lutador " + nome 
       + " aplicou um golpe no lutador " + lutador.getNome());

       if(lutador.getEnergia() <= 0) {
        System.out.println(lutador.getNome() + " está morto");
       }
    }

    public int getEnergia() {
        return energia;
    }
    public int getForça() {
        return força;
    }
    public String getNome() {
        return nome;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public void setForça(int força) {
        this.força = força;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
