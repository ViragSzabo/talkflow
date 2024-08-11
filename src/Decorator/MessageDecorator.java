package Decorator;

public abstract class MessageDecorator {
    private Message message;
    public MessageDecorator(Message message) {
        this.message = message;
    }
    public abstract void decorate(Message message);
}