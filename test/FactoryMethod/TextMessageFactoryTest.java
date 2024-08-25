package FactoryMethod;

import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextMessageFactoryTest {
    private Message message;
    private TextMessageFactory textMessageFactory;

    @BeforeEach
    public void setUp() {
        message = new Message("Test message", null);
        textMessageFactory = new TextMessageFactory("Hello, World!");
    }

    @Test
    public void testCreateMessage() {
        Message message = textMessageFactory.createMessage();
        assertNotNull(message, "Message should not be null");
        assertEquals("Hello, World!", message.getContent(), "Content should match");
        assertNull(message.getAttachment(), "Attachment should be null for text message");
    }
}