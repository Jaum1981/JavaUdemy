package generics.curingasDelimitados.entities;

public class Rectangle implements Shape {

    private double widht;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return widht * height;
    }


}
