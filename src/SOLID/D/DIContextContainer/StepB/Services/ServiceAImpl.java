package SOLID.D.DIContextContainer.StepB.Services;

import SOLID.D.DIContextContainer.StepB.Annotations.Inject;
import SOLID.D.DIContextContainer.StepB.Services.Interfaces.ServiceA;
import SOLID.D.DIContextContainer.StepB.Services.Interfaces.ServiceB;

public class ServiceAImpl implements ServiceA {
    @Inject
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