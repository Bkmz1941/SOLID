package SOLID.O.BadCodeDesign;

public class Main {
    public static void main(String[] args) {
        // This expression isn't correct and throws error after changing
        // Guitar guitar = new Guitar("Model1", "Spani", 20);
        Guitar guitar = new Guitar("Model1", "Spani", 20, "red");
    }
}
