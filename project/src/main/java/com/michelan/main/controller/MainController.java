package com.michelan.main.controller;
import com.michelan.main.model.Exhibition;
import com.michelan.main.repository.ExhibitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private ExhibitionRepository exhibitionRepository;


    @GetMapping
    public String Main(Model model) {
        List<Exhibition> exhibition = exhibitionRepository.findAll();
        model.addAttribute("Exhibition", exhibition);
        return "main";
    }

}
