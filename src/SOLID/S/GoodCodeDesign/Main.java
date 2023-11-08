package SOLID.S.GoodCodeDesign;

import SOLID.S.GoodCodeDesign.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Book1", "Ilya", "Hello world");
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printTextToConsole(book.getText());
        bookPrinter.printTextToAnotherMedium(book.getText());
    }
}
