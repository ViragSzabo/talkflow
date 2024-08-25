package Decorator;

import Message.Message;

public class EmojiDecorator extends MessageDecorator {
    public EmojiDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        // Add an emoji to the existing message content
        return super.getContent() + " 😊";
    }
}