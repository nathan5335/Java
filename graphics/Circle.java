package graphics;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }
}
