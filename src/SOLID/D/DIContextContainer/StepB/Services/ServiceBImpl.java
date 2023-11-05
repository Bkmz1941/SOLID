package SOLID.D.DIContextContainer.StepB.Services;

import SOLID.D.DIContextContainer.StepB.Annotations.Inject;
import SOLID.D.DIContextContainer.StepB.Services.Interfaces.ServiceA;
import SOLID.D.DIContextContainer.StepB.Services.Interfaces.ServiceB;

public class ServiceBImpl implements ServiceB {
    @Inject
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
