package inheritance;

class A {
    public void callClass_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void callClass_B() {
        System.out.println("Class B");
    }
}

class C extends B {
    public void callClass_C() {
        System.out.println("Class C");
    }
}

class D extends A {
    public void callClass_D() {
        System.out.println("Class C");
    }
}

public class hierarchical_Inheritance {
    public static void main(String[] args) {

        System.out.println("From Class C: ");
        C objOfC = new C();
        objOfC.callClass_C();
        objOfC.callClass_A();


        System.out.println("From Class B: ");
        B objOfB = new B();
        objOfB.callClass_A();
        objOfB.callClass_B();


        System.out.println("From Class : A");

    }
}
