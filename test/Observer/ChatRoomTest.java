package Observer;

import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChatRoomTest {
    private ChatRoom chatRoom;
    private ChatWindow chatWindow;

    @BeforeEach
    public void setUp() {
        chatRoom = new ChatRoom();
        chatWindow = new ChatWindow("Test Window");
        chatRoom.addObserver(chatWindow);
    }

    @Test
    public void testAddObserver() {
        assertTrue(chatRoom.getObservers().contains(chatWindow), "Observer should be added to the chat room");
    }

    @Test
    public void testNotifyObservers() {
        Message message = new Message("Hello World", null);
        chatRoom.addMessage(message);
    }

    @Test
    public void testRemoveObserver() {
        chatRoom.removeObserver(chatWindow);
        assertFalse(chatRoom.getObservers().contains(chatWindow), "Observer should be removed from the chat room");
    }
}