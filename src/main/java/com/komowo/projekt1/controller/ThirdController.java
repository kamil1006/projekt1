package com.komowo.projekt1.controller;

import com.komowo.projekt1.entity.Komorka;
import com.komowo.projekt1.entity.Pracownik;
import com.komowo.projekt1.entity.PracownikDodatkowe;
import com.komowo.projekt1.entity.Zatrudnienie;
import com.komowo.projekt1.repository.KomorkaRepository;
import com.komowo.projekt1.repository.PracownikDodatkoweRepository;
import com.komowo.projekt1.repository.PracownikRepository;
import com.komowo.projekt1.service.KomorkaService;
import com.komowo.projekt1.service.PracownikDodatkoweService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller // This means that this class is a Controller
public class ThirdController {
    //---------------------------------------------------
    @Autowired
    KomorkaRepository komorkaRepository;
    @Autowired
    KomorkaService komorkaService;

    //---------------------------------------------------
    @GetMapping("/pokazKomorki")
    public String pokazKomorki(Model model)
    {
        List<Komorka> komorki = komorkaService.findAllService();
        model.addAttribute("komorki11",komorki);
        for(Komorka kom:komorki)
        {
            System.out.println("nazwa" + kom.toString());
        }
        return "pokazKomorkiForm";
    }
    //---------------------------------------------------
    //---------------------------------------------------
    @GetMapping("/pokazKomorkaZatrudnienie")
    public String pokazKomorkaZatrudnienie(@RequestParam("komorkaId") int id,Model model)
    {
        Komorka komorka = komorkaRepository.findById(id).get();
        List<Zatrudnienie> zatrudnienie = komorka.getZatrudnienie();
        model.addAttribute("komorka2",komorka);
        model.addAttribute("komorka2Zatrudnienie",zatrudnienie);


        return "pokazKomorkaZatrudnienieForm";
    }
    //---------------------------------------------------
    //---------------------------------------------------



    //---------------------------------------------------

    //---------------------------------------------------
}
