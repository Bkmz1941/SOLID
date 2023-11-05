package SOLID.D.DIContextContainer.StepC;

import SOLID.D.DIContextContainer.StepC.Services.Interfaces.ServiceA;
import SOLID.D.DIContextContainer.StepC.Services.Interfaces.ServiceB;
import SOLID.D.DIContextContainer.StepC.Services.ServiceAImpl;
import SOLID.D.DIContextContainer.StepC.Services.ServiceBImpl;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        DIContext context = createContext();
        doBusinessLogic(context);
    }

    private static DIContext createContext() throws Exception {
        String rootPackageName = Main.class.getPackage().getName();
        return DIContext.createContextForPackage(rootPackageName);
    }

    private static void doBusinessLogic(DIContext context) {
        ServiceA serviceA = context.getServiceInstance(ServiceA.class);
        ServiceB serviceB = context.getServiceInstance(ServiceB.class);
        System.out.println(serviceA.jobA());
        System.out.println(serviceB.jobB());
    }
}
