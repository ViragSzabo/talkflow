package Command;

import java.util.ArrayList;

public class UndoManager {
    private ArrayList<Command> commands;
    public UndoManager() {
        commands = new ArrayList<>();
    }
    public void addCommand(Command command) {
        commands.add(command);
    }
    public void undo() {
        commands.remove(commands.size() - 1);
    }
    public void redo(Command command) {
        commands.remove(commands.size() - 1);
        commands.add(command);
    }
}