package SOLID.D.SimpleDIContainer.Services;

public class SMSMessageService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.printf("SMS sent to %s: %s%n", recipient, message);
    }
}
