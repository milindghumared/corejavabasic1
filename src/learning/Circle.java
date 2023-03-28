package learning;

public class Circle extends Shape implements Drawable{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("drawing");

    }

    @Override
    public double area() {
        return Math.PI * radius * radius;

    }
}
