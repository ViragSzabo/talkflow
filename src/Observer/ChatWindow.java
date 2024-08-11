package Observer;

import Message.Message;

public class ChatWindow implements Observer {
    private final String name;

    public ChatWindow(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println(name + " received: " + message);
    }
}