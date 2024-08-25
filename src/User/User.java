package User;

import Builder.Attachment;
import Mediator.ChatMediator;
import Message.Message;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class User {
    private String name;
    private String hashedPassword;
    private ChatMediator chatMediator;

    public User(String name, String password, ChatMediator chatMediator) {
        this.name = name;
        this.hashedPassword = hashPassword(password);
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean authenticate(String password) {
        return hashedPassword.equals(hashPassword(password));
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = digest.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hashedBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Password hashing algorithm not found", e);
        }
    }

    public void sendMessage(Message message) {
        chatMediator.sendMessage(this, message);
    }

    public ChatMediator getChatMediator() {
        return chatMediator;
    }

    public void setChatMediator(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    public void receiveMessage(Message message) {
        if (chatMediator == null) {
            throw new IllegalStateException("ChatMediator is not initialized");
        }
        if (message == null) {
            throw new IllegalArgumentException("Message cannot be null");
        }
        chatMediator.addMessage(message);
        Message lastMessage = chatMediator.getMessages().isEmpty() ? null : chatMediator.getMessages().get(chatMediator.getMessages().size() - 1);
        System.out.println(name + " received message: " + (lastMessage != null ? lastMessage.getContent() : "No messages"));
    }
}