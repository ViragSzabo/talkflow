package Message;

import Builder.Attachment;

public class Message {
    private final String content;
    private final Attachment attachment;

    public Message(String content, Attachment attachment) {
        this.content = content;
        this.attachment = attachment;
    }

    public String getContent() {
        return content;
    }

    public Attachment getAttachment() {
        return attachment;
    }
}