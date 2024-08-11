package Decorator;

public class EmojiDecorator extends MessageDecorator {
    public EmojiDecorator(Message message) {
        super(message);
    }

    @Override
    public void decorate(Message message) {
        System.out.println(message);
    }
}
