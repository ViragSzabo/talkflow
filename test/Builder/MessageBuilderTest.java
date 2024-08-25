package Builder;

import Builder.Attachment;
import Builder.MessageBuilder;
import Message.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageBuilderTest {

    @Test
    public void testMessageWithAttachment() {
        byte[] data = {1, 2, 3};
        Attachment attachment = new Attachment("file.txt", data);
        MessageBuilder builder = new MessageBuilder();
        Message message = builder
                .setContent("Hello, world!")
                .setAttachment(attachment)
                .build();

        assertEquals("Hello, world!", message.getContent());
        assertNotNull(message.getAttachment());
        assertEquals("file.txt", message.getAttachment().getFileName());
    }

    @Test
    public void testMessageWithoutAttachment() {
        MessageBuilder builder = new MessageBuilder();
        Message message = builder
                .setContent("Hello, world!")
                .build();

        assertEquals("Hello, world!", message.getContent());
        assertNull(message.getAttachment());
    }

    @Test
    public void testMessageBuilderReuse() {
        byte[] data = {1, 2, 3};
        Attachment attachment = new Attachment("file.txt", data);
        MessageBuilder builder = new MessageBuilder();

        // First message with attachment
        MessageBuilder builderWithAttachment = new MessageBuilder();
        Message messageWithAttachment = builderWithAttachment
                .setContent("Hello, world!")
                .setAttachment(attachment)
                .build();

        // Second message without attachment
        MessageBuilder builderWithoutAttachment = new MessageBuilder();
        Message messageWithoutAttachment = builderWithoutAttachment
                .setContent("Hello again!")
                .build();

        assertEquals("Hello again!", messageWithoutAttachment.getContent());
        assertNull(messageWithoutAttachment.getAttachment());
    }
}
