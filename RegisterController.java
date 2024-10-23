package com.freelancer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.freelancer.models.User;
import com.freelancer.services.UserService;

@Controller
public class RegisterController {

    @Autowired
    private UserService UserService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        UserService.saveUser(user);
        return "registrationSuccess";
    }
}
