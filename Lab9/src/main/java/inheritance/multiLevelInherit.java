package inheritance;

class one {
    public void print_metro()
    {
        System.out.print("Metro");
    }
}

class two extends one {
    public void print_ploitan() {
        System.out.print("politan");
    }
}

class three extends two {
    public void print_uni() {
        System.out.print(" University");
    }
}

// main class
public class multiLevelInherit {
    public static void main(String[] args)
    {
        three uniName = new three();
        uniName.print_metro();
        uniName.print_ploitan();
        uniName.print_uni();
    }
}
