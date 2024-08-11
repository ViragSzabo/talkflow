package Builder;

import Message.Message;

public class MessageBuilder {
    private String content;
    private Attachment attachment;

    public MessageBuilder() {}

    public MessageBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public MessageBuilder setAttachment(Attachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public Message build() {
        return new Message(content, attachment);
    }
}