package SOLID.D.BadCodeDesign.PC;

/**
 * By declaring the StandardKeyboard and Monitor with the new keyword, we’ve tightly coupled these three classes together
 */
public class Windows98Machine {
    private final StandardKeyboard keyboard;
    private final StandardMonitor monitor;

    public Windows98Machine() {
        this.monitor = new StandardMonitor(); // (!)
        this.keyboard = new StandardKeyboard(); // (!)
    }

    public void printConfiguration() {
        System.out.printf("keyboard: %s, monitor: %s", this.keyboard, this.monitor);
    }
}
