/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YASIN
 */

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.1415 * radius * radius;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class questionTwo {
    public static void main(String[] args) {
        Rectangle rectangleObj = new Rectangle(5, 10);
        Circle CircleObj = new Circle(3);
        Triangle triangleObj = new Triangle(4, 6);

        System.out.println("Rectanglea: " + rectangleObj.getArea());
        System.out.println("Circle: " + CircleObj.getArea());
        System.out.println("Triangle Area: " + triangleObj.getArea());
    }
}

