package com.gradle.entity;

@Entity
public class User {
    @Id
    private int userId;
    private String userName;
    @Column(name ="addres")
    private String address;
    private double salary;
    private int age;
    private String password;
}
