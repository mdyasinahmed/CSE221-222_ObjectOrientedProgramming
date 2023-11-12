/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YASIN
 */

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Start CAR Engine!!");
    }
    @Override
    void stopEngine() {
        System.out.println("Stop CAR Engine!!");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Start MOTORCYCLE Engine!!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop MOTORCYCLE Engine!!");
    }
}

public class questionOne {
    public static void main(String[] args) {
        Car carOBJ = new Car();
        Motorcycle motorcycleOBJ = new Motorcycle();

        carOBJ.startEngine();
        carOBJ.stopEngine();

        motorcycleOBJ.startEngine();
        motorcycleOBJ.stopEngine();
    }
}

