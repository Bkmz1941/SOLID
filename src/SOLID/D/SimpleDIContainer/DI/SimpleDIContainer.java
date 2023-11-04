package SOLID.D.SimpleDIContainer.DI;

import java.util.HashMap;
import java.util.Map;

public class SimpleDIContainer implements DIContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    @Override
    public <T> void register(Class<T> type, T instance) {
        this.instances.put(type, instance);
    }

    @Override
    public <T> T resolve(Class<T> type) {
        T instance = (T) instances.get(type);
        if (instance == null) {
            throw new IllegalArgumentException("No registered instance found for type: " + type.getName());
        }
        return instance;
    }
}
