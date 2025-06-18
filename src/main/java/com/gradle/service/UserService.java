package com.gradle.service;

import com.gradle.entity.User;
import com.gradle.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service

public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    // Add methods to interact with the UserRepo, e.g., find, save, delete users

    public User findUserById(int userId) {
        return userRepo.findById(userId).orElse(null);
    }
}
