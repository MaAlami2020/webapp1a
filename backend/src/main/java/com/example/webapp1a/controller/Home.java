package com.example.webapp1a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    
    @GetMapping("/")
    public String home(Model model){
        return "lookbook";
    }
}
