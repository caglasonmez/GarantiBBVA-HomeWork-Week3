// GameController
interface GameController {
    void pressButton(String button);
}

// Xbox sınıfı
class Xbox implements GameController {
    @Override
    public void pressButton(String button) {
        System.out.println("Xbox: " + button + " button pressed");
    }
}

// Playstation sınıfı
class Playstation implements GameController {
    @Override
    public void pressButton(String button) {
        System.out.println("Playstation: " + button + " button pressed");
    }
}

public class Main {
    public static void main(String[] args) {
        // Xbox and Playstation controllers
        GameController xboxController = new Xbox();
        GameController playstationController = new Playstation();

        // Computer with Xbox controller
        Computer computerWithXbox = new Computer();
        computerWithXbox.open();
        computerWithXbox.addController(xboxController);
        computerWithXbox.playGame();
        computerWithXbox.shutdown();

        System.out.println();

        // Computer with Playstation controller
        Computer computerWithPlaystation = new Computer();
        computerWithPlaystation.open();
        computerWithPlaystation.addController(playstationController);
        computerWithPlaystation.playGame();
        computerWithPlaystation.shutdown();
    }
}