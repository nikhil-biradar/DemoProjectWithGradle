package com.gradle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

import java.util.List;

@Entity
public class User {
  
    @Id
    private int userId;
    private String userName;

    @Email
    @Column(unique = true)
    private String email;
    private String address;
    private double salary;
    private int age;
    private String password;
    private String name;

    @Column(columnDefinition = "enum('ADMIN', 'USER')")
    private String role;
}
