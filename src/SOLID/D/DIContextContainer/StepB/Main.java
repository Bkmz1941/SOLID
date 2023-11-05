package SOLID.D.DIContextContainer.StepB;

import SOLID.D.DIContextContainer.StepB.Services.Interfaces.ServiceA;
import SOLID.D.DIContextContainer.StepB.Services.Interfaces.ServiceB;
import SOLID.D.DIContextContainer.StepB.Services.ServiceAImpl;
import SOLID.D.DIContextContainer.StepB.Services.ServiceBImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        DIContext context = createContext();
        doBusinessLogic(context);
    }

    private static DIContext createContext() throws Exception {
        Set<Class<?>> serviceClasses = new HashSet<>();
        serviceClasses.add(ServiceAImpl.class);
        serviceClasses.add(ServiceBImpl.class);
        return new DIContext(serviceClasses);
    }

    private static void doBusinessLogic(DIContext context) {
        ServiceA serviceA = context.getServiceInstance(ServiceA.class);
        ServiceB serviceB = context.getServiceInstance(ServiceB.class);
        System.out.println(serviceA.jobA());
        System.out.println(serviceB.jobB());
    }
}
