package User;

import Message.Message;
import Mediator.ChatMediator;

public class User {
    private String name;
    private String password;
    private ChatMediator chatMediator;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void sendMessage(Message message) {
        chatMediator.sendMessage(this, message);
    }
    public void receiveMessage(Message message) {
        chatMediator.getMessages().getLast();
    }
}