package Observer;

import Decorator.Message;

public interface Observer {
    void update(Message message);
}