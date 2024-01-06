package solve.q1;

class A{
    A() {
        System.out.println("Parent Constructor");
    }
    A(String name){
        System.out.println("Name " + name);
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Child Constructor");
    }
    
    B(String name) {
        super(name);
        System.out.println("Name " + name);
    }
}

public class Main22 {
    
}
