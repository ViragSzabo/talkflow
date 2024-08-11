package Command;

public class EditCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Edit Command");
    }

    @Override
    public void undo() {
        System.out.println("Undo Command");
    }
}
