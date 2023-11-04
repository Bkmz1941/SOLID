import SOLID.*;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("MAC", 16000);
        ComputerKeeperable computerKeeper = new ComputerKeeperToDB();
        computerKeeper.save(computer);
    }
}