package atu.ie.cicd_project;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;

    @NotEmpty(message = "Name is required")
    private String name;

    @Email(message = "Email is invalid")
    private String email;

    @NotEmpty(message = "Password is required")
    private String password;

}
