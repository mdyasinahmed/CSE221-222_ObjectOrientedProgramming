package solve.q1;

class Parent{
    Parent(){
        System.out.println("Parent Constructor.");
    }
}

class Child extends Parent{
    Child() {
        super();
        System.out.println("Child Constructor.");
    }
}

public class Main3 {
    public static void main(String args[]){
        Child obj = new Child();
    }
}
