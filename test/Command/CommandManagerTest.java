package Command;

import Builder.Attachment;
import Command.CommandManager;
import Command.EditCommand;
import Command.DeleteCommand;
import Command.SendCommand;
import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandManagerTest {
    private CommandManager commandManager;
    private Message message;
    byte[] data = {};
    Attachment attachment = new Attachment("file.txt", data);

    @BeforeEach
    public void setUp() {
        commandManager = new CommandManager();
        message = new Message("Original Content", attachment);
    }

    @Test
    public void testExecuteAndUndo() {
        // Test Edit Command
        EditCommand editCommand = new EditCommand(message, "Edited Content");
        commandManager.executeCommand(editCommand);
        assertEquals("Edited Content", message.getContent());

        commandManager.undoLastCommand();
        assertEquals("Original Content", message.getContent());

        // Test Delete Command
        DeleteCommand deleteCommand = new DeleteCommand(message);
        assertTrue(commandManager.executeCommand(deleteCommand));

        commandManager.undoLastCommand();
        assertEquals("Original Content", message.getContent());

        // Test Send Command
        SendCommand sendCommand = new SendCommand(message);
        commandManager.executeCommand(sendCommand);
        assertTrue(message.isSent());

        commandManager.undoLastCommand();
        assertTrue(message.isSent());
    }
}