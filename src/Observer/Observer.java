package Observer;

import Message.Message;

public interface Observer {
    void update(Message message);
}