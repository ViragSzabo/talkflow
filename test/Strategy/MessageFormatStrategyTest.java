package Strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageFormatStrategyTest {

    @Test
    public void testPlainTextFormatStrategy() {
        MessageFormatStrategy strategy = new PlainTextFormatStrategy();
        String formattedMessage = strategy.format("This is a test message.");
        assertEquals("PlainTextFormatStrategy: This is a test message.", formattedMessage, "Plain text formatting should be correct.");
    }

    @Test
    public void testHTMLFormatStrategy() {
        MessageFormatStrategy strategy = new HTMLFormatStrategy();
        String formattedMessage = strategy.format("This is a test message.");
        assertEquals("<html><body>This is a test message.</body></html>", formattedMessage, "HTML formatting should be correct.");
    }
}