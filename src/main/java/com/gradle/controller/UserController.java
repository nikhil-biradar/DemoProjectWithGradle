package com.gradle.controller;


import com.gradle.entity.User;
import com.gradle.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private static UserService userService;


    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/{id}")public ResponseEntity<User>  getById(@PathVariable int id) {
        User user = userService.findUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}