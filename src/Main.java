import Builder.Attachment;
import Builder.MessageBuilder;
import Message.Message;

public class Main {
    public static void main(String[] args) {
        // Create a message with attachment
        Attachment attachment = new Attachment("file.txt", new byte[] {1, 2, 3});
        MessageBuilder builder = new MessageBuilder();
        Message messageWithAttachment = builder
                .setContent("Hello, world!")
                .setAttachment(attachment)
                .build();

        System.out.println("Message: " + messageWithAttachment.getContent());
        System.out.println("Attachment: " + messageWithAttachment.getAttachment().getFileName());

        // Create a message without attachment
        Message messageWithoutAttachment = builder
                .setContent("Hello, world!")
                .build();

        System.out.println("Message: " + messageWithoutAttachment.getContent());
        System.out.println("Attachment: " + messageWithoutAttachment.getAttachment()); // Should be null
    }
}