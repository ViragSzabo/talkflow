package Command;

import Message.Message;

public class EditCommand extends Command {
    private final Message message;
    private final String newContent;
    private String oldContent;

    public EditCommand(Message message, String newContent) {
        this.message = message;
        this.newContent = newContent;
    }

    @Override
    public void execute() {
        oldContent = message.getContent();
        message.setContent(newContent);
        System.out.println(STR."Message edited: \{newContent}");
    }

    @Override
    public void undo() {
        message.setContent(oldContent);
        System.out.println(STR."Undo edit: \{oldContent}");
    }
}