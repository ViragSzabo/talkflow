public class EmojiDecorator implements MessageDecorator {
    @Override
    public void decorate(Message message) {
        System.out.println(message);
    }
}
