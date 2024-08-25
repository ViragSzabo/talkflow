package Decorator;

import Message.Message;

public class TimestampDecorator extends MessageDecorator {
    private final boolean addTimestamp;

    public TimestampDecorator(Message message, boolean addTimestamp) {
        super(message);
        this.addTimestamp = addTimestamp;
    }

    @Override
    public String getContent() {
        if (addTimestamp) {
            return STR."[\{System.currentTimeMillis()}] \{super.getContent()}";
        } else {
            return super.getContent();
        }
    }
}