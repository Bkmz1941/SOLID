package SOLID.S.GoodCodeDesign;

public class BookPrinter {
    void printTextToConsole(String text) {
        System.out.printf("[BookPrinter]: %s\n", text);
    }

    void printTextToAnotherMedium(String text) {
        System.out.printf("[BookPrinter]: <b>%s<b>\n", text);
    }
}
