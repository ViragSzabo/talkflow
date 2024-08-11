import java.text.MessageFormat;

public class User {
    private String name;
    private String password;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void sendMessage(String content) {
        new Message(content);
        System.out.println("Message sent.");
    }
    public void receiveMessage() {
        System.out.println(MessageFormat.format("{0} received a message.", name));
    }
}