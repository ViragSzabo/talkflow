package Mediator;

import Builder.Attachment;
import Message.Message;
import User.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChatMediatorTest {
    private ChatMediator chatMediator;
    private User user1;
    private User user2;
    private Message message;
    byte[] data = {};
    Attachment attachment = new Attachment("file.txt", data);

    @BeforeEach
    public void setUp() {
        chatMediator = new ChatMediator(); // Initialize the ChatMediator instance
        user1 = new User("User1", "", chatMediator);
        user2 = new User("User2", "", chatMediator);
        message = new Message("Hello", attachment);

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addMessage(message);
    }

    @Test
    public void testSendMessage() {
        chatMediator.sendMessage(user1, message);
        assertTrue(chatMediator.getMessages().contains(message), "Message should be added to the mediator");
    }
}