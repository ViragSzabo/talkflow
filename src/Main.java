import Message.Message;
import Observer.ChatRoom;
import Observer.ChatWindow;

public class Main {
    public static void main(String[] args) {
        // Create a chat room
        ChatRoom chatRoom = new ChatRoom();

        // Create chat windows and register them as observers
        ChatWindow window1 = new ChatWindow("Window 1");
        ChatWindow window2 = new ChatWindow("Window 2");

        chatRoom.addObserver(window1);
        chatRoom.addObserver(window2);

        // Add messages to the chat room
        chatRoom.addMessage(new Message("Hello, world!"));
        chatRoom.addMessage(new Message("How are you?"));
    }
}