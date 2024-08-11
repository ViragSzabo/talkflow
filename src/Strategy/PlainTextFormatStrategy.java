package Strategy;

import java.text.MessageFormat;

public class PlainTextFormatStrategy implements MessageFormatStrategy {
    @Override
    public String format(String message) {
        return MessageFormat.format("PlainTextFormatStrategy: {0}", message);
    }
}