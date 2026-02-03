package com.distributedsystem.userservice.controller;

import com.distributedsystem.userservice.entity.User;
import com.distributedsystem.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/test")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}