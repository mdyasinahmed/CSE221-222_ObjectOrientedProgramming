// Question: Write a java program to create a base class Cities with methods location() and famousFor(). Create three subclass Dhaka, Sylhet, Khulna. Use method overriding to describe where these places


class Cities {
    void location() {
    }
    void famousFor() {
    }
}

class Dhaka extends Cities{
    @Override
    void location() {
        super.location();
        System.out.println("Dhaka\nLocated in Middle Part of BD.");
    }

    void famousFor(){
        System.out.println("National Zoo and Meusium.");
    }
}

class Sylhet extends Cities{
    @Override
    void location() {
        System.out.println("Sylhet\n Located in North East Part of BD.");
    }
    void famousFor(){
        System.out.println("Famous for: Tea.");
    }
}

class Khulna extends Cities{
    @Override
    void location() {
        System.out.println("Khulna\n Located in Southern Part of BD.");
    }
    void famousFor(){
        System.out.println("Famous for: SeaFood.");
    }
}



public class task2 {
    public static void main(String args[]) {
        Dhaka dhakaObj = new Dhaka();
        dhakaObj.location();
        dhakaObj.famousFor();

        Sylhet sylObj = new Sylhet();
        sylObj.location();
        sylObj.famousFor();

        Khulna khulnaObj = new Khulna();
        khulnaObj.location();
        khulnaObj.famousFor();
    }
}
