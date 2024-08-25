package Observer;

import Observer.ChatWindow;
import Observer.Observer;
import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChatWindowTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ChatWindow chatWindow;

    @BeforeEach
    public void setUp() {
        // Redirect System.out to capture the output
        System.setOut(new PrintStream(outContent));
        chatWindow = new ChatWindow("Test Window");
    }

    @Test
    public void testUpdate() {
        // Create a message to update with
        Message message = new Message("Hello World", null);

        // Call the update method
        chatWindow.update(message);

        // Capture the output
        String expectedOutput = STR."Test Window received: \{message}\{System.lineSeparator()}";
        String actualOutput = outContent.toString();

        // Check if the expected output matches the actual output
        assertEquals(expectedOutput, actualOutput, "The output should match the expected message");
    }
}