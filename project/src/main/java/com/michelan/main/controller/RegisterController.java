package com.michelan.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account/register")
public class RegisterController {
    @GetMapping
    public String Register() {
        return "/account/register";
    }
}
