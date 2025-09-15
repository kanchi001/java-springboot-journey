// package com.example.demospring.controller;
// import com.example.demospring.model.User;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class HelloController {

//     @GetMapping("/hello")
//     public String sayHello() {
//         return "Hello, Spring Boot is running!";
//     }

//     @GetMapping("/user")
//     public User getUser() {
//         // Build a User object using Builder pattern
//         return new User.Builder()
//                 .firstName("Kanchi")
//                 .lastName("Acaba")
//                 .age(25)
//                 .build();
//     }
// }

package com.example.demospring.controller;
import com.example.demospring.model.User;
import com.example.demospring.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final UserService userService;

    // Constructor Injection (best practice in Spring)
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public User getUser() {
        return userService.buildSampleUser();
    }
}
