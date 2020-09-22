package com.komowo.projekt1.controller;

import com.komowo.projekt1.entity.Grupa;
import com.komowo.projekt1.entity.Komorka;
import com.komowo.projekt1.entity.Medal;
import com.komowo.projekt1.entity.Stanowisko;
import com.komowo.projekt1.repository.GrupaRepository;
import com.komowo.projekt1.repository.KomorkaRepository;
import com.komowo.projekt1.repository.MedalRepository;
import com.komowo.projekt1.repository.StanowiskoRepository;
import com.komowo.projekt1.service.KomorkaService;
import com.komowo.projekt1.service.StanowiskoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller // This means that this class is a Controller
public class MainController {
    //---------------------------------------------------
    @Autowired
    GrupaRepository grupaRepository;

    @Autowired
    MedalRepository medalRepository;



    //testujemy dostep przez repository i service
    @Autowired
    StanowiskoRepository stanowiskoRepository;
    @Autowired
    StanowiskoService stanowiskoService;

    //---------------------------------------------------
    @RequestMapping("/")
    public String home() {

        return "home";
    }
    //---------------------------------------------------
    //---------------------------------------------------
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

        return "pokazGrupaAktualizuj";
    }
    //---------------------------------------------------
    @PostMapping("/zapiszGrupe")
    public String zapiszGrupe(@ModelAttribute("grupa1") Grupa grupa){


            grupaRepository.zapisz(grupa);

        return "redirect:/pokazGrupy ";
    }
    //---------------------------------------------------
    //---------------------------------------------------
    //---------------------------------------------------
    @GetMapping("/pokazMedale")
    public String pokazMedale(Model model)
    {
        List<Medal> medale = medalRepository.findAll();
        model.addAttribute("medale1",medale);
        return "pokazMedaleForm";
    }
    //---------------------------------------------------
    @GetMapping("/pokazMedalAktualizuj")
    public String pokazMedalAktualizuj(@RequestParam("medalId") String id,Model model)
    {
        Medal medal = medalRepository.findById(id).get();
        model.addAttribute("medal1",medal);

        return "pokazMedalAktualizuj";
    }
    //---------------------------------------------------
    @PostMapping("/zapiszMedal")
    public String zapiszMedal(@ModelAttribute("medal1") Medal medal){


        medalRepository.save(medal);

        return "redirect:/pokazMedale ";
    }
    //---------------------------------------------------
    //---------------------------------------------------
    //---------------------------------------------------
    @GetMapping("/pokazStanowiska")
    public String pokazStanowiska(Model model)
    {
        List<Stanowisko> stanowiska = stanowiskoRepository.findAll();
        model.addAttribute("stanowiska1",stanowiska);
        return "pokazStanowiskaForm";
    }
    //---------------------------------------------------
    @GetMapping("/pokazStanowiskoAktualizuj")
    public String pokazStanowiskoAktualizuj(@RequestParam("stanowiskoId") String id,Model model)
    {
        //Stanowisko stanowisko = stanowiskoRepository.findById(id).get();
        Stanowisko stanowisko =stanowiskoService.findByIdService(id);
                model.addAttribute("stanowisko1",stanowisko);

        return "pokazStanowiskoAktualizuj";
    }
    //---------------------------------------------------
    @PostMapping("/zapiszStanowisko")
    public String zapiszStanowisko(@ModelAttribute("stanowisko1") Stanowisko stanowisko){


        stanowiskoRepository.save(stanowisko);

        return "redirect:/pokazStanowiska ";
    }
    //---------------------------------------------------
    //---------------------------------------------------
    //---------------------------------------------------

}
