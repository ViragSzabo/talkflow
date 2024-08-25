package Builder;

import Builder.Attachment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AttachmentTest {

    @Test
    public void testAttachmentCreation() {
        byte[] data = {1, 2, 3};
        Attachment attachment = new Attachment("file.txt", data);

        assertEquals("file.txt", attachment.getFileName());
        assertArrayEquals(data, attachment.getData());
    }

    @Test
    public void testAttachmentWithEmptyData() {
        byte[] data = {};
        Attachment attachment = new Attachment("file.txt", data);

        assertEquals("file.txt", attachment.getFileName());
        assertArrayEquals(data, attachment.getData());
    }
}