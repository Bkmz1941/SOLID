package SOLID;

/**
 * This interface implements the second principle `Open-Closed`. Instead of modifying existing classes
 * we are creating new and implemented this interface
 */
public interface ComputerKeeperable {
    void save(Computer computer);
}
