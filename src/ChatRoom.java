import java.util.ArrayList;

public class ChatRoom {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private final ArrayList<Message> messages = new ArrayList<>();

    public ChatRoom() {}
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void addMessage(Message message) {
        messages.add(message);
        notifyObservers();
    }
    public void removeMessage(Message message) {
        messages.remove(message);
    }
    public ArrayList<Message> getMessages() {
        return messages;
    }
    public ArrayList<Observer> getObservers() {
        return observers;
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            if(!messages.isEmpty()) {
                observer.update(messages.getLast());
            }
        }
    }
}