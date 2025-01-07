package atu.ie.cicd_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setName("John");
        user.setEmail("john@example.com");
        user.setPassword("password");

        User createdUser = userService.createUser(user);
        assertNotNull(createdUser.getId());
    }
}
