package localVariable;

public class MyClass{
    public int ins; //instance variable

    public void modulus(){
        int a = 100;        //local variable
        int b = 40;         //local variable
        System.out.println("Modulus is: " + (a%b));
        this.ins = a;       //local to instance
    }
}
