package com.michelan.main.controller;


import com.michelan.main.model.Galleryview;
import com.michelan.main.repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/gallery")
public class GalleryController {

    @Autowired
    private GalleryRepository galleryRepository;

    @GetMapping("/galleryview")
    public String Galleryview(Model model) {
        List<Galleryview> galleryview = galleryRepository.findAll();
        model.addAttribute("galleryview", galleryview);
        return "gallery/galleryview";
    }
}
