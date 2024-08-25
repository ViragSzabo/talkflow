package User;

import Mediator.ChatMediator;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private final Map<String, User> users = new HashMap<>();

    public void registerUser(String name, String password, ChatMediator chatMediator) {
        if (users.containsKey(name)) {
            throw new IllegalArgumentException("User already exists");
        }
        User user = new User(name, password, chatMediator);
        users.put(name, user);
    }

    public User authenticate(String name, String password) {
        User user = users.get(name);
        if (user != null && user.authenticate(password)) {
            return user;
        } else {
            throw new IllegalArgumentException("Invalid username or password");
        }
    }
}
