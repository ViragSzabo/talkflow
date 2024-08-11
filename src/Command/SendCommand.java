package Command;

public class SendCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Send Command");
    }

    @Override
    public void undo() {
        System.out.println("Undo Command");
    }
}