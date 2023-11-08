package SOLID.S.BadCodeDesign;

public class Book {
    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Methods that directly relate to the book properties
    public String replaceWordInText(String word, String replacementWord) {
        return this.text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word) {
        return this.text.contains(word);
    }

    // Method violates the single responsibility principle
    void printTextToConsole() {
        System.out.printf("[BookPrinter]: %s", this.text);
    }
}
