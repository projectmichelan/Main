package com.michelan.main.controller;

import com.michelan.main.model.Exhibition;
import com.michelan.main.model.User;
import com.michelan.main.repository.ExhibitionRepository;
import com.michelan.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GalleryController {

    @Autowired
    private ExhibitionRepository exhibitionRepository;


    @GetMapping("/gallery")
    public String Gallery(Model model) {
        List<User> user = UserRepository.findAll();
        model.addAttribute("User", user);

        return "gallery";
    }
}
