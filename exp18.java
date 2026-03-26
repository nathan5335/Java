interface Shape {
    double getArea();
    String getShapeName();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

class Square implements Shape {
    private double side;

    Square(double side) {
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

class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
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

public class exp18 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(7);
        Shape triangle = new Triangle(6, 8);
        Shape circle = new Circle(5);

        System.out.println(" Graphics - Area Calculator");
        System.out.println();
        
        displayShapeInfo(rectangle);
        displayShapeInfo(square);
        displayShapeInfo(triangle);
        displayShapeInfo(circle);
        
        System.out.println("");
    }

    public static void displayShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape.getShapeName());
        System.out.println("Area: " + String.format("%.2f", shape.getArea()));
        
        // Display additional details based on shape type
        if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            System.out.println("Length: " + rect.getLength() + ", Width: " + rect.getWidth());
        } else if (shape instanceof Square) {
            Square sq = (Square) shape;
            System.out.println("Side: " + sq.getSide());
        } else if (shape instanceof Triangle) {
            Triangle tri = (Triangle) shape;
            System.out.println("Base: " + tri.getBase() + ", Height: " + tri.getHeight());
        } else if (shape instanceof Circle) {
            Circle cir = (Circle) shape;
            System.out.println("Radius: " + cir.getRadius());
        }
        System.out.println();
    }
}
