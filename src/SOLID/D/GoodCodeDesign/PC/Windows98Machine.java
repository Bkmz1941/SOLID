package SOLID.D.GoodCodeDesign.PC;

import SOLID.D.GoodCodeDesign.PC.Interfaces.Keyboard;
import SOLID.D.GoodCodeDesign.PC.Interfaces.Monitor;

public class Windows98Machine {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public void printConfiguration() {
        System.out.printf("keyboard: %s, monitor: %s", this.keyboard, this.monitor);
    }
}
