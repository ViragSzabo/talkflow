package Decorator;

import Decorator.EmojiDecorator;
import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmojiDecoratorTest {
    private Message message;
    private EmojiDecorator emojiDecorator;

    @BeforeEach
    public void setUp() {
        message = new Message("Test message", null);
        emojiDecorator = new EmojiDecorator(message);
    }

    @Test
    public void testEmojiAdded() {
        String decoratedContent = emojiDecorator.getContent();
        assertEquals("Test message 😊", decoratedContent,
                "The content should have an emoji appended.");
    }

    @Test
    public void testEmojiAddedToEmptyContent() {
        message = new Message("", null);
        emojiDecorator = new EmojiDecorator(message);

        String decoratedContent = emojiDecorator.getContent();
        assertEquals(" 😊", decoratedContent,
                "The content should just be an emoji if the original content is empty.");
    }
}