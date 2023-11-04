package SOLID.D.GoodCodeDesign;

import SOLID.D.GoodCodeDesign.PC.StandardKeyboard;
import SOLID.D.GoodCodeDesign.PC.StandardMonitor;
import SOLID.D.GoodCodeDesign.PC.Windows98Machine;

public class Main {
    public static void main(String[] args) {
        Windows98Machine pc = new Windows98Machine(new StandardKeyboard(), new StandardMonitor());
        pc.printConfiguration();
    }
}
