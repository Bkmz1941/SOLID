package SOLID;

/**
 * This class have only one purpose - to keep the computer and has different function for that
 * Methods `saveToFile` and `saveToDatabase` violate the principle `Open-Closed`
 */
public class ComputerKeeper {
    public void saveToFile(Computer computer) {
        System.out.println("Saving computer to file... | path: " + computer);
    }

    public void saveToDatabase(Computer computer) {
        System.out.println("Saving computer to database... | table: " + computer);
    }
}
