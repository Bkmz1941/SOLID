package SOLID.D.SimpleDIContainer.DI;

public interface DIContainer {
    <T> void register(Class<T> type, T instance);

    <T> T resolve(Class<T> type);
}
