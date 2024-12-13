package com.example.login_register.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idUser;

    private String name;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private String img;
    private String role;

}
