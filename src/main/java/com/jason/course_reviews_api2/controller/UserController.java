package com.jason.course_reviews_api2.controller;

import com.jason.course_reviews_api2.domain.user.User;
import com.jason.course_reviews_api2.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User signUp(@RequestParam String email, @RequestParam(name = "passwd") String passwd){

        return userService.join(email,passwd);
    }

    @PostMapping("/login")
    public User login(@RequestParam String email, @RequestParam String passwd){

        return userService.login(email,passwd);
    }
}
