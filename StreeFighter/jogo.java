package StreeFighter;

public class jogo {
    public static void main(String[] args) {
        lutador Ryu = new lutador("Ryu", 100, 10);

        lutador Bison = new lutador("Bison", 100,12);

        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);

        System.out.println(Bison.getNome() + " está com " + Bison.getEnergia() +" de energia");

        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);

        System.out.println(Ryu.getNome() + " está com " + Ryu.getEnergia() + " de energia");

    }
}
