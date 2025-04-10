package it.auth.authentication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String email;
    private String password;
}
