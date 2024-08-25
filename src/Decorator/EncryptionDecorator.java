package Decorator;

import Message.Message;

public class EncryptionDecorator extends MessageDecorator {
    public EncryptionDecorator(Message message) { super(message); }

    @Override
    public String getContent() {
        String originalContent = super.getContent();
        return STR."Encrypted: \{new StringBuilder(originalContent).reverse().toString()}";
    }
}