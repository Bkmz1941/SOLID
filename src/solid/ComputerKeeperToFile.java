package solid;

public class ComputerKeeperToFile implements ComputerKeeperable {
    @Override
    public void save(Computer computer) {
        System.out.println("Saving computer to file... | path: " + computer);
    }
}