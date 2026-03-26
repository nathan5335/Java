package graphics;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    public double getSide() {
        return side;
    }
}
