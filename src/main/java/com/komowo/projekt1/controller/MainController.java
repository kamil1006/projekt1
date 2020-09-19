package com.komowo.projekt1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // This means that this class is a Controller
public class MainController {

    @RequestMapping("/")
    public String home() {

        return "home";
    }


    @GetMapping("/pokazPracownikow")
    public String pokazPracownikow()
    {

        return "pokazPracownikowForm";
    }



}
