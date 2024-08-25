package FactoryMethod;

import Message.Message;
import Builder.Attachment;

public class ImageMessageFactory extends MessageFactory {

    private final Attachment imageAttachment;

    public ImageMessageFactory(Attachment imageAttachment) {
        this.imageAttachment = imageAttachment;
    }

    @Override
    public Message createMessage() {
        return new Message("Image message", imageAttachment);
    }
}