package solve.q1;

class Animal{
    void sound() {
        System.out.println("Animal Shout!!");
    }
}

// Inherited Class Cat from Parent class Animal
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Mew! Mew!");  // Method Override
    }
}

public class Main {
    public static void main(String args[]) {
        Animal obj = new Cat();
        obj.sound();
    }
}
