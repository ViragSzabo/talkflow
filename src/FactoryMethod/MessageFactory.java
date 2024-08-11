package FactoryMethod;

import Decorator.Message;

public abstract class MessageFactory {
    public abstract Message createMessage();
}