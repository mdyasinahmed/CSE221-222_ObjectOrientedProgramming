import java.lang.Math;

class Shape {
    public double getArea() {
        return 0.0;
    }

    public double getParameter() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getParameter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getParameter() {
        return 2 * (width + length);
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getParameter() {
        return side1 + side2 + side3;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle - Area: " + circle.getArea() + ", Perimeter: " + circle.getParameter());
        System.out.println("Rectangle - Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getParameter());
        System.out.println("Triangle - Area: " + triangle.getArea() + ", Perimeter: " + triangle.getParameter());
    }
}
