package com.komowo.projekt1.service;

import com.komowo.projekt1.entity.PracownikDodatkowe;
import com.komowo.projekt1.entity.Stanowisko;
import com.komowo.projekt1.repository.PracownikDodatkoweRepository;
import com.komowo.projekt1.repository.StanowiskoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class StanowiskoService {
    //-----------------------------------------------

    @Autowired
    EntityManager em;

    @Autowired
    StanowiskoRepository repository;

    public List<Stanowisko> findAllService() {

        List<Stanowisko> stanowisko = repository.findAll();

        return stanowisko;

    }
    //-----------------------------------------------
    public Stanowisko findByIdService(String id){
          /*
          Optional<PracownikDodatkowe> pracownikDodatkowe1 = repository.findById(id);
        PracownikDodatkowe pracownikDodatkowe= pracownikDodatkowe1.get();
        return pracownikDodatkowe;
        */
        Stanowisko stanowisko=em.find(Stanowisko.class,id);
        return stanowisko;

    }
    //-----------------------------------------------


    //-----------------------------------------------

}
