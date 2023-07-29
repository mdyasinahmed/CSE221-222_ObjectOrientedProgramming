package InstanceVariable;

public class Main {
    public static void main(String[] args){
        MyClass MyClassObject = new MyClass();
        MyClassObject.sum();
        System.out.println("First Value: "+MyClassObject.a); // Access instance Variable form Object
    }
}
