// package com.example.demospring.service;

// import com.example.demospring.model.User;
// import org.springframework.stereotype.Service;

// @Service
// public class UserService {

//     public User buildSampleUser() {
//         return new User.Builder()
//                 .firstName("Kanchi")
//                 .lastName("Acaba")
//                 .age(25)
//                 .build();
//     }
// }
package com.example.demospring.service;

import com.example.demospring.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    // Constructor loads some sample users
    public UserService() {
        users.add(new User.Builder().firstName("Kanchi").lastName("Acaba").age(25).build());
        users.add(new User.Builder().firstName("Rei").lastName("Tan").age(30).build());
        users.add(new User.Builder().firstName("Nica").lastName("Lopez").age(22).build());
    }

    // Return one user (default example)
    public User buildSampleUser() {
        return users.get(2);
    }

    // Return all users
    public List<User> getAllUsers() {
        return users;
    }
}
