package ru.netology.nosqlproject.models;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;
    @NotNull
    @NotBlank
    @Size(min=2, max=50)
    private String name;
    @Email
    private String email;
    @Min(0)
    @Max(120)
    private int age;
}
