package Mediator;

import Message.Message;
import User.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator {
    private final List<User> users;
    private final List<Message> messages;

    public ChatMediator() {
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public List<User> getUsers() {
        return new ArrayList<>(users); // Return a copy to avoid external modification
    }

    public List<Message> getMessages() {
        return new ArrayList<>(messages); // Return a copy to avoid external modification
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public void removeMessage(Message message) {
        this.messages.remove(message);
    }

    public void sendMessage(User sender, Message message) {
        this.messages.add(message);
        for (User user : users) {
            if (!user.equals(sender)) {
                user.receiveMessage(message); // Assuming User has a receiveMessage method
            }
        }
    }
}