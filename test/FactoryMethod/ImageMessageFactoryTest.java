package FactoryMethod;

import Message.Message;
import Builder.Attachment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImageMessageFactoryTest {
    private ImageMessageFactory imageMessageFactory;

    @BeforeEach
    public void setUp() {
        // Assuming you have some image data
        Attachment imageAttachment = new Attachment("image.jpg", new byte[]{1, 2, 3});
        imageMessageFactory = new ImageMessageFactory(imageAttachment);
    }

    @Test
    public void testCreateMessage() {
        Message message = imageMessageFactory.createMessage();
        assertNotNull(message, "Message should not be null");
        assertEquals("Image message", message.getContent(), "Content should be 'Image message'");
        assertNotNull(message.getAttachment(), "Attachment should not be null for image message");
        assertEquals("image.jpg", message.getAttachment().getFileName(), "Attachment file name should match");
    }
}