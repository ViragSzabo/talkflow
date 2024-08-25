package Command;

import Message.Message;

public class DeleteCommand extends Command {
    public DeleteCommand(Message message) {
        super();
    }

    @Override
    public void execute() {
        System.out.println("Delete command");
    }

    @Override
    public void undo() {
        System.out.println("Undo command");
    }
}
