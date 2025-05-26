package com.easyreserve.reserve.model;

import com.easyreserve.reserve.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;

    @NotBlank
    @Column(unique = true)
    private String email;

    @NotBlank
    private String password;

    @JsonIgnoreProperties
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public User(String name, String email, String encodedPassword, UserRole role) {
        this.name = name;
        this.email = email;
        this.password = encodedPassword;
        this.role = role;
    }

}
