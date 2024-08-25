package Message;

import Builder.Attachment;

public class Message {
    private String content;
    private Attachment attachment;
    private boolean isSent;

    public Message(String content, Attachment attachment) {
        this.content = content;
        this.attachment = attachment;
        this.isSent = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void setSent(boolean sent) {
        this.isSent = sent;
    }

    public boolean isSent() {
        return isSent;
    }
}