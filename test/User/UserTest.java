package User;

import Builder.Attachment;
import Mediator.ChatMediator;
import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private ChatMediator chatMediator;
    private User user;
    private byte[] data;
    private Attachment attachment;
    private Message message;

    @BeforeEach
    void setUp() {
        chatMediator = new ChatMediator();
        user = new User("HelloKitty", "1234", chatMediator);
        data = new byte[]{};
        attachment = new Attachment("file.txt", data);
        message = new Message("Hello", attachment);
    }

    @Test
    void testGetName() {
        assertEquals("HelloKitty", user.getName(), "User name should match the expected value");
    }

    @Test
    void testSetName() {
        user.setName("KittyForman");
        assertEquals("KittyForman", user.getName(), "User name should be updated correctly");
    }

    @Test
    void testAuthenticateCorrectPassword() {
        assertTrue(user.authenticate("1234"), "User should be authenticated with the correct password");
    }

    @Test
    void testAuthenticateIncorrectPassword() {
        assertFalse(user.authenticate("wrongPassword"), "User should not be authenticated with an incorrect password");
    }

    @Test
    void testSendMessage() {
        user.sendMessage(message);
        assertTrue(chatMediator.getMessages().contains(message), "Message should be added to the chat mediator");
    }

    @Test
    void testReceiveMessage() {
        user.receiveMessage(message);
        assertTrue(chatMediator.getMessages().contains(message), "Message should be added to the chat mediator");
    }
}