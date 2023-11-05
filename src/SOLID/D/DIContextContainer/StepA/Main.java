package SOLID.D.DIContextContainer.StepA;

import SOLID.D.DIContextContainer.StepA.Services.Interfaces.ServiceA;
import SOLID.D.DIContextContainer.StepA.Services.Interfaces.ServiceB;
import SOLID.D.DIContextContainer.StepA.Services.ServiceAImpl;
import SOLID.D.DIContextContainer.StepA.Services.ServiceBImpl;

public class Main {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceAImpl();
        ServiceB serviceB = new ServiceBImpl();

        serviceA.setServiceB(serviceB);
        serviceB.setServiceA(serviceA);

        System.out.println(serviceA.jobA());
    }
}
