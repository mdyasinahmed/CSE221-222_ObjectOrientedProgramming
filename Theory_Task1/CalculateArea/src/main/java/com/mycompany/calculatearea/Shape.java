/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatearea;

/**
 *
 * @author YASIN
 */
public class Shape {
    double radius, base, height;
    int side1, side2;
    
    Shape(double radius){
        this.radius = radius;
    }
    Shape(double base, double height){
        this.base = base;
        this.height = height;
    }
    Shape(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
}
