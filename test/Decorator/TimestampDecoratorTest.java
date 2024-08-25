package Decorator;

import Decorator.TimestampDecorator;
import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimestampDecoratorTest {
    private Message message;
    private TimestampDecorator timestampDecorator;

    @BeforeEach
    public void setUp() {
        message = new Message("Test message", null);
    }

    @Test
    public void testTimestampAdded() {
        timestampDecorator = new TimestampDecorator(message, true);
        String decoratedContent = timestampDecorator.getContent();

        assertTrue(decoratedContent.matches("\\[\\d+] Test message"),
                "The content should start with a timestamp.");
    }

    @Test
    public void testNoTimestamp() {
        timestampDecorator = new TimestampDecorator(message, false);
        String decoratedContent = timestampDecorator.getContent();

        assertEquals("Test message", decoratedContent,
                "The content should remain unchanged if addTimestamp is false.");
    }
}