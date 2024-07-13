package com.example.controller;

import com.example.proj.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ApiController {

    @Autowired
    UserService userService;

//    @GetMapping("/query")
//    public String query(String email) {
//        return userService.query(email);
//    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.register(user.getEmail(), user.getPassword());
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.login(user.getEmail(), user.getPassword());

    }


}
