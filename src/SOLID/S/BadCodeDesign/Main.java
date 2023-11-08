package SOLID.S.BadCodeDesign;

import SOLID.S.BadCodeDesign.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Book1", "Ilya", "Hello world");
        book.printTextToConsole();
    }
}
