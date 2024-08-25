package Decorator;

import Builder.Attachment;
import Message.Message;

public abstract class MessageDecorator extends Message {
    protected final Message message;

    public MessageDecorator(Message message) {
        super(message.getContent(), message.getAttachment());
        this.message = message;
    }

    @Override
    public String getContent() {
        return message.getContent();
    }

    @Override
    public Attachment getAttachment() {
        return message.getAttachment();
    }
}