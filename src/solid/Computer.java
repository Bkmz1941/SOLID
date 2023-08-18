package solid;

/**
 * Methods `saveToFile` and `saveToDatabase` violate the principle `Single responsibility`
 * Class Computer should have only one purpose: to describe the computer
 */
public class Computer {
    public String name;
    public int memory;

    public Computer(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

//    public void saveToFile(String path) {
//        System.out.println("Saving computer to file... | path: " + path + " | " + this);
//    }
//
//    public void saveToDatabase(String table) {
//        System.out.println("Saving computer to database... | table: " + table  + " | " + this);
//    }
}
