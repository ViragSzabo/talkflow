import java.util.ArrayList;

public class ChatRoom {
    private final ArrayList<ChatWindow> observers = new ArrayList<>();
    private final ArrayList<Message> messages = new ArrayList<>();

    public ChatRoom() {}
    public void addObserver(ChatWindow observer) {
        observers.add(observer);
    }
    public void removeObserver(ChatWindow observer) {
        observers.remove(observer);
    }
    public void addMessage(Message message) {
        messages.add(message);
    }
    public void removeMessage(Message message) {
        messages.remove(message);
    }
    public ArrayList<Message> getMessages() {
        return messages;
    }
    public ArrayList<ChatWindow> getObservers() {
        return observers;
    }
    public void notifyObservers() {
        for (ChatWindow observer : observers) {
            observer.notify();
        }
    }
}