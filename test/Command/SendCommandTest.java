package Command;

import Builder.Attachment;
import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SendCommandTest {
    private Message message;
    private SendCommand sendCommand;
    byte[] data = {};
    Attachment attachment = new Attachment("file.txt", data);

    @BeforeEach
    public void setUp() {
        message = new Message("Content to be sent", attachment);
        sendCommand = new SendCommand(message);
    }

    @Test
    public void testExecute() {
        sendCommand.execute();
        assertTrue(message.isSent());
    }

    @Test
    public void testUndo() {
        sendCommand.execute();
        sendCommand.undo();
        assertTrue(message.isSent());
    }
}