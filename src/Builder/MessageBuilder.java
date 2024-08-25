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
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content cannot be null or empty");
        }
        Message message = new Message(content, attachment);
        this.content = null;
        this.attachment = null;
        return message;
    }
}