package Strategy;

import java.text.MessageFormat;

public class HTMLFormatStrategy implements MessageFormatStrategy {
    @Override
    public String format(String message) {
        return MessageFormat.format("<html><body>{0}</body></html>", message);
    }
}