package com.gradle.entity;

@Entity
public class User {
  
    @Id
    private int userId;
    private String userName;
    private double salary;
    private int age;
    private String password;
}
