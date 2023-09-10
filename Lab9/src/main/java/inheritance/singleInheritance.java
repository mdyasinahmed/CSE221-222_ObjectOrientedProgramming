package inheritance;

// Parent class
class first {
    public void print_mu() {
        System.out.println("Metropolitan University");
    }
}

class last extends first {
    public void print_sust() {
        System.out.println("Shahjalal University Of Science & Technology");
    }
}

// Driver class
public class singleInheritance {
    // Main function

    public static void main(String[] args)
    {
        last childObj = new last();
        childObj.print_mu();
        childObj.print_sust();

    }
}

