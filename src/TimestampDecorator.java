public class TimestampDecorator implements MessageDecorator {
    @Override
    public void decorate(Message message) {
        System.out.println(message);
    }
}
