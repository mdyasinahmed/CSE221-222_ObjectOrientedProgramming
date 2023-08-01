package LabTest;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Radius of Circle: ");
        double radius = scan.nextDouble();
        Shape printCircleArea = new Shape(radius);
        printCircleArea.circleArea();

        System.out.print("Enter the Base and Height of Triangle: ");
        double base = scan.nextDouble();
        double height = scan.nextDouble();
        Shape printTriangleArea = new Shape(base,height);
        printTriangleArea.triangleArea();

        System.out.print("Enter the Side 1 and Side 2 of Rectangle: ");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        Shape printRectangleArea = new Shape(side1,side2);
        printRectangleArea.rectangleArea();

    }
}


