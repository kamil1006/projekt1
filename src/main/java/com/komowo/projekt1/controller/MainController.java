package com.komowo.projekt1.controller;

import com.komowo.projekt1.entity.Grupa;
import com.komowo.projekt1.repository.GrupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller // This means that this class is a Controller
public class MainController {
    //---------------------------------------------------
    @Autowired
    GrupaRepository grupaRepository;

    //---------------------------------------------------
    @RequestMapping("/")
    public String home() {

        return "home";
    }

    //---------------------------------------------------
    @GetMapping("/pokazPracownikow")
    public String pokazPracownikow()
    {

        return "pokazPracownikowForm";
    }
    //---------------------------------------------------
    @GetMapping("/pokazGrupy")
    public String pokaGgrupy(Model model)
    {
        List<Grupa> grupy = grupaRepository.findAll();
        model.addAttribute("grupy1",grupy);
        return "pokazGrupyForm";
    }
    //---------------------------------------------------
    @GetMapping("/pokazGrupaAktualizuj")
    public String pokazGrupaAktualizuj(@RequestParam("grupaId") String id,Model model)
    {
        Grupa grupa = grupaRepository.findById(id);
        model.addAttribute("grupa1",grupa);

        System.out.println("tuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuut");


        return "pokazGrupaAktualizuj";
    }
    //---------------------------------------------------
    @PostMapping("/zapiszGrupe")
    public String zapiszGrupe(@ModelAttribute("grupa1") Grupa grupa){


            grupaRepository.zapisz(grupa);

        return "redirect:/pokazGrupy ";
    }
    //---------------------------------------------------
}
