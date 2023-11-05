package SOLID.D.DIContextContainer.StepC.Services;

import SOLID.D.DIContextContainer.StepC.Annotations.Inject;
import SOLID.D.DIContextContainer.StepC.Annotations.Service;
import SOLID.D.DIContextContainer.StepC.Services.Interfaces.ServiceA;
import SOLID.D.DIContextContainer.StepC.Services.Interfaces.ServiceB;

@Service
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