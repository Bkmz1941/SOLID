package SOLID.D.SimpleDIContainer;

import SOLID.D.SimpleDIContainer.DI.DIContainer;
import SOLID.D.SimpleDIContainer.DI.SimpleDIContainer;
import SOLID.D.SimpleDIContainer.Services.MessageService;
import SOLID.D.SimpleDIContainer.Services.SMSMessageService;

public class Main {
    public static void main(String[] args) {
        DIContainer container = new SimpleDIContainer();
        container.register(MessageService.class, new SMSMessageService());

        MessageService messageService = container.resolve(MessageService.class);
        messageService.sendMessage("Hello, World!", "john@example.com");
    }
}
