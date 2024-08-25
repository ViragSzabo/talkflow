import Builder.Attachment;
import Builder.MessageBuilder;
import Decorator.EmojiDecorator;
import Message.Message;
import Decorator.TimestampDecorator;
import Mediator.ChatMediator;
import User.*;

public class Main {
    public static void main(String[] args) {
        // Setup chat mediator and authentication service
        ChatMediator chatMediator = new ChatMediator();
        AuthService authService = new AuthService();

        // Register users
        authService.registerUser("HelloKitty", "1234", chatMediator);
        authService.registerUser("KittyForman", "4321", chatMediator);

        // Authenticate users
        User user1 = authService.authenticate("HelloKitty", "1234");
        User user2 = authService.authenticate("KittyForman", "4321");

        // Create and send messages
        Attachment attachment = new Attachment("file.txt", new byte[]{1, 2, 3});
        MessageBuilder builderWithAttachment = new MessageBuilder();
        Message messageWithAttachment = builderWithAttachment
                .setContent("Hello, world!")
                .setAttachment(attachment)
                .build();

        user1.sendMessage(messageWithAttachment);

        // Create a message without an attachment
        MessageBuilder builderWithoutAttachment = new MessageBuilder();
        Message messageWithoutAttachment = builderWithoutAttachment
                .setContent("Hello again!")
                .build();

        user2.sendMessage(messageWithoutAttachment);

        // Decorate a message
        Message message = new Message("Hello, World!", null);
        Message decoratedMessage = new TimestampDecorator(new EmojiDecorator(message), true);
        System.out.println(decoratedMessage.getContent());
    }
}