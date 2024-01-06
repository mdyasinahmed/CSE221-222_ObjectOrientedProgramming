package solve.q1;

class Animal{
        String display(String name){
            return name;
        }
  
        String display(String name, String sound){
            return name + sound;
        }
}

public class OverloadTest {
    public static void main(String args[]){
        Animal obj = new Animal();
        System.out.println(obj.display("Name: Cat"));
        System.out.println(obj.display("Name: Cat", "Mew! Mew!"));
    }   
}
