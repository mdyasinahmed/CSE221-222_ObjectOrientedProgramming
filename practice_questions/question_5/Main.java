class Sports {
    public void play() {
        System.out.println("Playing a generic sport.");
    }
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football.");
    }
}

class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball.");
    }
}

class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby.");
    }
}

public class Main {
    public static void main(String[] args) {
        Sports genericSport = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        genericSport.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
