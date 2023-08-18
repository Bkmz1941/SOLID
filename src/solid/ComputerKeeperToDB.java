package solid;

public class ComputerKeeperToDB implements ComputerKeeperable {
    @Override
    public void save(Computer computer) {
        System.out.println("Saving computer to database... | table: " + computer);
    }
}
