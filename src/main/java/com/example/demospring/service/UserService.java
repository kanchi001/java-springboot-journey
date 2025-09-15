package com.example.demospring.service;

import com.example.demospring.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User buildSampleUser() {
        return new User.Builder()
                .firstName("Kanchi")
                .lastName("Acaba")
                .age(25)
                .build();
    }
}
