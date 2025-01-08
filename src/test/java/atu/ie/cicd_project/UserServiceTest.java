package atu.ie.cicd_project;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.Optional;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setName("John");
        user.setEmail("john@example.com");
        user.setPassword("password");

        when(userRepository.save(any(User.class))).thenReturn(user);

        User createdUser = userService.createUser(user);
        assertNotNull(createdUser.getId());
    }

    @Test
    public void testGetUserById() {
        User user = new User();
        user.setId("123");
        user.setName("John");
        user.setEmail("john@example.com");
        user.setPassword("password");

        when(userRepository.findById("123")).thenReturn(Optional.of(user));

        User foundUser = userService.getUserById("123");
        assertNotNull(foundUser);
        assertEquals(user.getName(), foundUser.getName());
    }
}
