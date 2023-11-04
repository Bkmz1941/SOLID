package SOLID.D.SimpleDIContainer.Services;

public class EmailMessageService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.printf("Email sent to %s: %s%n", recipient, message);
    }
}
