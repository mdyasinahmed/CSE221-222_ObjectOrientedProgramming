package function.parameter;

public class OperateClass {
    public void add(int a, int b){
        int c = a+b;
        System.out.println("Value 1: "+a);
        System.out.println("Value 2: "+b);
        System.out.println("Sum is: "+c);
    }
    public void divide(int x, int y){
        System.out.println("Value 1: "+x);
        System.out.println("Value 2: "+y);
        System.out.print("Division is: "+(x+y));
    }
    public void multiplication(int p, int q){
        System.out.println("Value 1: "+p);
        System.out.println("Value 2: "+q);
        System.out.println("Multiplication Result is"+(p*q));
    }
}
