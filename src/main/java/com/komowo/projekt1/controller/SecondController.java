package com.komowo.projekt1.controller;

import com.komowo.projekt1.entity.Grupa;
import com.komowo.projekt1.entity.Pracownik;
import com.komowo.projekt1.entity.PracownikDodatkowe;
import com.komowo.projekt1.repository.GrupaRepository;
import com.komowo.projekt1.repository.PracownikDodatkoweRepository;
import com.komowo.projekt1.repository.PracownikRepository;
import com.komowo.projekt1.service.PracownikDodatkoweService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller // This means that this class is a Controller
public class SecondController {
    //---------------------------------------------------
    @Autowired
    PracownikRepository pracownikRepository;

    @Autowired
    PracownikDodatkoweRepository pracownikDodatkoweRepository;

    @Autowired
    PracownikDodatkoweService pracownikDodatkoweService;

    //---------------------------------------------------
    @GetMapping("/pokazPracownikow")
    public String pokazPracownikow(Model model)
    {
        List<Pracownik> pracownicy = pracownikRepository.findAll();
        model.addAttribute("pracownicy1",pracownicy);
        return "pokazPracownikowForm";
    }
    //---------------------------------------------------
    @GetMapping("/pokazPracownikDodatkowe")
    public String pokazPracownikDodatkowe(@RequestParam("pracownikId") String id,Model model)
    {
        Optional<Pracownik> pracownik = pracownikRepository.findById(id);
        Pracownik pracownik1 = pracownik.get();
        model.addAttribute("pracownik1",pracownik1);

        PracownikDodatkowe pracownikDodatkowe =pracownik1.getPracownikDodatkowe();
        model.addAttribute("pracownikDodatkowe1",pracownikDodatkowe);

        return "pokazPracownikDodatkowe";
    }
    //---------------------------------------------------
    //---------------------------------------------------



    //---------------------------------------------------

    //---------------------------------------------------
}
