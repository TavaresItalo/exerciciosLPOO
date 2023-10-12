package Polimorfismo;

public abstract class shape {
    protected String colour;
    protected boolean filled;
    protected double area;
    protected double perimeter;
    
    public shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public void calculeteArea() {
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void calculetePerimeter() {
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean getFilled() {
        return filled;
    }

    
}