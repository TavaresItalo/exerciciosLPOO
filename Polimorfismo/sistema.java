package Polimorfismo;

public class sistema {
    public static void main(String[] args) {
        circle bola = new circle("Yellow", true, 2);
        rectangle quadrado = new rectangle("Red", false, 2, 2);
        rectangle retangulo = new rectangle("Blue", true, 2, 4);

        System.out.println(bola.getColour());
        bola.calculeteArea();
        System.out.println(bola.getArea());
        bola.calculetePerimeter();
        System.out.println(bola.getPerimeter());
        quadrado.calculeteArea();
        System.out.println(quadrado.getArea());
        quadrado.defineSquare();

    }
}
