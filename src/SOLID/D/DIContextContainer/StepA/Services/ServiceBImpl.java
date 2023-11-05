package SOLID.D.DIContextContainer.StepA.Services;

import SOLID.D.DIContextContainer.StepA.Services.Interfaces.ServiceB;
import SOLID.D.DIContextContainer.StepA.Services.Interfaces.ServiceA;

public class ServiceBImpl implements ServiceB {
    private ServiceA serviceA;

    public ServiceA getServiceA() {
        return serviceA;
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public String jobB() {
        return "jobB";
    }
}
