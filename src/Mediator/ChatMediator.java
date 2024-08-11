package Mediator;

import Message.Message;
import User.User;

import java.util.ArrayList;

public class ChatMediator {
    private final ArrayList<User> users;
    private final ArrayList<Message> messages;

    public ChatMediator(User user, Message message) {
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }
    public void addMessage(Message message) {
        this.messages.add(message);
    }
    public ArrayList<User> getUsers() {
        return users;
    }
    public ArrayList<Message> getMessages() {
        return messages;
    }
    public void removeUser(User user) {
        this.users.remove(user);
    }
    public void removeMessage(Message message) {
        this.messages.remove(message);
    }
    public void sendMessage(User user, Message message) {
        this.users.add(user);
        this.messages.add(message);
    }
}