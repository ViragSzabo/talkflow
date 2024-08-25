package Command;

import Message.Message;

public class SendCommand extends Command {
    public SendCommand(Message message) {
        super();
    }

    @Override
    public void execute() {
        System.out.println("Send Command");
    }

    @Override
    public void undo() {
        System.out.println("Undo Command");
    }
}