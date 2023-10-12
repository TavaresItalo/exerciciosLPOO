package Polimorfismo;



public class rectangle extends shape implements square  {
    private double width;
    private double length;
    
    public rectangle(String colour, boolean filled, double width, double length) {
        super(colour, filled);
        this.length = length;
        this.width = width;
    }

    public void calculeteArea() {
        double rectanglesArea = width * length;
        this.setArea(rectanglesArea);
    }

    public void calculetePerimeter() {
        double rectanglesPerimeter = (width * 2) + (length * 2);
        this.setPerimeter(rectanglesPerimeter);
    }

    public void defineSquare() {
        if(width == length) {
            System.out.println("It's a square!");
        } else {
            System.out.println("It's a rectangle!");
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
