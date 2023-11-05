package SOLID.D.DIContextContainer.StepC.Services;

import SOLID.D.DIContextContainer.StepC.Annotations.Inject;
import SOLID.D.DIContextContainer.StepC.Annotations.Service;
import SOLID.D.DIContextContainer.StepC.Services.Interfaces.ServiceA;
import SOLID.D.DIContextContainer.StepC.Services.Interfaces.ServiceB;

@Service
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
