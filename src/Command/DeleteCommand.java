package Command;

public class DeleteCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Delete command");
    }

    @Override
    public void undo() {
        System.out.println("Undo command");
    }
}
