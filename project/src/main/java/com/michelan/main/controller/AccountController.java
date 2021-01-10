package com.michelan.main.controller;

import com.michelan.main.model.User;
import com.michelan.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String account() {
        return "account";
    }

    @PostMapping
    public String register(User user){
        userService.save(user);
        return "redirect:/";
    }
}