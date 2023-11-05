package SOLID.D.DIContextContainer.StepA.Services;

import SOLID.D.DIContextContainer.StepA.Services.Interfaces.ServiceA;
import SOLID.D.DIContextContainer.StepA.Services.Interfaces.ServiceB;

public class ServiceAImpl implements ServiceA {
    private ServiceB serviceB;

    public ServiceB getServiceB() {
        return serviceB;
    }

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public String jobA() {
        return "jobA(" + this.serviceB.jobB() + ")";
    }
}