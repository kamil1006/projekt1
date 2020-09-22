package com.komowo.projekt1.service;

import com.komowo.projekt1.entity.Pracownik;
import com.komowo.projekt1.repository.PracownikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PracownikService {
    //-----------------------------------------------
    @Autowired
    PracownikRepository repository;

    public List<Pracownik> findAllService() {

        List<Pracownik> pracownicy = repository.findAll();

        return pracownicy;

    }
    //-----------------------------------------------
public Pracownik findByIdService(String id){

    Optional<Pracownik> pracownik = repository.findById(id);
    Pracownik pracownik1= pracownik.get();


    return pracownik1;
}

    //-----------------------------------------------


    //-----------------------------------------------

}
