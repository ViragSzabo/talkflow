package Decorator;

import Message.Message;

public abstract class MessageDecorator {
    private final Message message;
    public MessageDecorator(Message message) {
        this.message = message;
    }
    public abstract void decorate(Message message);
}