/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarTask;

/**
 *
 * @author YASIN
 */
public class Car {
    int number;
    String company = "tesla";
    String OwnerName;
    String color;
    
    public  void PrintInfo(){
           System.out.println(this.number); 
           System.out.println(this.company); 
           System.out.println(this.OwnerName); 
           System.out.println(this.color); 
    }
}
