package com.javadeveloperzone.controller;
import org.springframework.web.bind.annotation.*;

import com.javadeveloperzone.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody User user) {
        return "User created: " + user.getFirstName() + " " + user.getLastName();
    }
}
