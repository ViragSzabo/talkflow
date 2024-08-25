package Command;

import Builder.Attachment;
import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EditCommandTest {
    private Message message;
    private EditCommand editCommand;
    byte[] data = {};
    Attachment attachment = new Attachment("file.txt", data);

    @BeforeEach
    public void setUp() {
        message = new Message("Original Content", attachment);
        editCommand = new EditCommand(message, "Edited Content");
    }

    @Test
    public void testExecute() {
        editCommand.execute();
        assertEquals("Edited Content", message.getContent());
    }

    @Test
    public void testUndo() {
        editCommand.execute();
        editCommand.undo();
        assertEquals("Original Content", message.getContent());
    }
}