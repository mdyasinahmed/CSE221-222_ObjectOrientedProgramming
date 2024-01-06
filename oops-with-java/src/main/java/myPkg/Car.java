package myPkg;

// A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.
class Information{
    // instance variable
    String model;
    int year;
    String color;
    
    
    // method
    void Display(){
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
    }
}


public class Car {
    public static void main(String args[]) {
        // create object
        Information carObj = new Information();
        carObj.model= "Tesla";
        carObj.year = 2023;
        carObj.color = "Black";
        carObj.Display();
        
    }
}
