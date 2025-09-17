package com.example.demospring.controller;

import com.example.demospring.model.User;
import com.example.demospring.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    // Existing endpoint
    @GetMapping("/hello")
    public User getUser() {
        return userService.buildSampleUser();
    }

    // New endpoint for multiple users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
