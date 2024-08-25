package Message;

import Builder.Attachment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {
    private byte[] data;
    private Attachment attachment;
    private Message message;

    @BeforeEach
    void setUp() {
        data = new byte[]{};
        attachment = new Attachment("file.txt", data);
        message = new Message("Hello", attachment);
    }

    @Test
    void testGetContent() {
        assertEquals("Hello", message.getContent(), "Content should be 'Hello'");
    }

    @Test
    void testSetContent() {
        message.setContent("New Content");
        assertEquals("New Content", message.getContent(), "Content should be updated to 'New Content'");
    }

    @Test
    void testGetAttachment() {
        assertEquals(attachment, message.getAttachment(), "Attachment should be the one provided");
    }

    @Test
    void testSetAttachment() {
        Attachment newAttachment = new Attachment("newfile.txt", new byte[]{1, 2, 3});
        message.setAttachment(newAttachment);
        assertEquals(newAttachment, message.getAttachment(), "Attachment should be updated to the new attachment");
    }

    @Test
    void testSetSent() {
        message.setSent(true);
        assertTrue(message.isSent(), "Message should be marked as sent");
    }

    @Test
    void testIsSent() {
        assertFalse(message.isSent(), "Message should not be sent by default");
        message.setSent(true);
        assertTrue(message.isSent(), "Message should be marked as sent after calling setSent(true)");
    }
}