package User;

import Mediator.ChatMediator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthServiceTest {
    private AuthService authService;
    private ChatMediator chatMediator;

    @BeforeEach
    void setUp() {
        chatMediator = new ChatMediator();
        authService = new AuthService();
    }

    @Test
    void testRegisterAndAuthenticate() {
        authService.registerUser("testUser", "testPass", chatMediator);
        User user = authService.authenticate("testUser", "testPass");
        assertNotNull(user, "User should be authenticated successfully");
        assertEquals("testUser", user.getName(), "User name should match");
    }

    @Test
    void testAuthenticateInvalidPassword() {
        authService.registerUser("testUser", "testPass", chatMediator);
        assertThrows(IllegalArgumentException.class, () -> {
            authService.authenticate("testUser", "wrongPass");
        }, "Authentication should fail with incorrect password");
    }

    @Test
    void testRegisterExistingUser() {
        authService.registerUser("testUser", "testPass", chatMediator);
        assertThrows(IllegalArgumentException.class, () -> {
            authService.registerUser("testUser", "newPass", chatMediator);
        }, "Registration should fail if user already exists");
    }

    @Test
    void testAuthenticateNonExistentUser() {
        assertThrows(IllegalArgumentException.class, () -> {
            authService.authenticate("nonExistentUser", "testPass");
        }, "Authentication should fail for non-existent user");
    }
}