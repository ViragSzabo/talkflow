package Decorator;

import Message.Message;

public class TimestampDecorator extends MessageDecorator {
    public TimestampDecorator(Message message) {
        super(message);
    }

    @Override
    public void decorate(Message message) {
        System.out.println(message);
    }
}
