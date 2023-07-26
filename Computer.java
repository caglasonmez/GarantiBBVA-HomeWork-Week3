class Computer {
    private boolean isOpen;
    private GameController controller;

    public Computer() {
        isOpen = false;
    }

    public void open() {
        if (isOpen) {
            throw new RuntimeException("Computer is already open.");
        }
        isOpen = true;
    }

    public void shutdown() {
        if (!isOpen) {
            throw new RuntimeException("Computer is already closed.");
        }
        isOpen = false;
    }

    public void addController(GameController controller) {
        this.controller = controller;
    }

    public void playGame() {
        if (!isOpen) {
            throw new RuntimeException("Computer is closed.");
        }
        if (controller == null) {
            throw new RuntimeException("No controller is connected.");
        }
        System.out.println("Game started!");
        controller.pressButton("Pass");
        controller.pressButton("Shoot");
        controller.pressButton("Through Ball");
        controller.pressButton("Cross");
    }
}
