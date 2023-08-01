package LabTest;

public class Shape {
    double radius, base, height;
    int side1, side2;

    // circle area operation
    Shape(double radius){
        this.radius = radius;
    }
    public void circleArea(){
        double result = 3.1416*this.radius*this.radius;
        System.out.println(result);
    }

    //triangle area operation
    Shape(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void triangleArea(){
        double result = (0.5)*this.base*this.height;
        System.out.println(result);
    }

    // rectangle area operation
    Shape(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public void rectangleArea(){
        int result = side1*side2;
        System.out.println(result);
    }
}
