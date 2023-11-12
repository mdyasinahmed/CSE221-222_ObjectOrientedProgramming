/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YASIN
 */
abstract class Employee {
    String name;
    int ID;
    
    public abstract double calculateSalary();
    abstract void displayInfo();
    
    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
}

class Manager extends Employee {
    private int workingDays;
    
    public Manager(String name, int ID, int workingDays) {
        super(name, ID);
        this.workingDays = workingDays;
    }
    
    @Override
    public double calculateSalary() {
        return workingDays*1000;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.name);
        System.out.println("Manager Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private int workingDays;
    
    public Programmer(String name, int ID, int workingDays) {
        super(name, ID);
        this.workingDays = workingDays;
    }
    
    @Override
    public double calculateSalary() {
        return workingDays*2000;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.name);
        System.out.println("Programmer Salary: " + calculateSalary());
    }
    
}

public class question3 {
    public static void main(String[] args) {
           Manager man = new Manager("Mostafiz", 90, 30);
           man.displayInfo();
           man.calculateSalary();
              
           Programmer pro = new Programmer("Sabbir", 100, 15);
           pro.displayInfo();
           pro.calculateSalary();
           
    }
}