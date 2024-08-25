package FactoryMethod;

import Message.Message;

public class TextMessageFactory extends MessageFactory {

    private final String textContent;

    public TextMessageFactory(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public Message createMessage() {
        return new Message(textContent, null);
    }
}