package Polimorfismo;

public class circle extends shape {
     double radius;

    public circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    public void calculeteArea() {
        double circlesArea = 3.14 * (radius * radius);
        this.setArea(circlesArea);
    }

    public void calculetePerimeter() {
        double circlesPerimeter = 2 * 3.14 * radius;
        this.setPerimeter(circlesPerimeter);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
