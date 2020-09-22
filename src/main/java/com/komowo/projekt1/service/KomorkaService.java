package com.komowo.projekt1.service;

import com.komowo.projekt1.entity.Komorka;
import com.komowo.projekt1.entity.Stanowisko;
import com.komowo.projekt1.repository.KomorkaRepository;
import com.komowo.projekt1.repository.StanowiskoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class KomorkaService {
    //-----------------------------------------------

    @Autowired
    EntityManager em;

    @Autowired
   KomorkaRepository repository;

    public List<Komorka> findAllService() {

        List<Komorka> komorka = repository.findAll();

        return komorka;

    }
    //-----------------------------------------------
    public Komorka findByIdService(int id){
          /*
          Optional<PracownikDodatkowe> pracownikDodatkowe1 = repository.findById(id);
        PracownikDodatkowe pracownikDodatkowe= pracownikDodatkowe1.get();
        return pracownikDodatkowe;
        */
        Komorka komorka=em.find(Komorka.class,id);
        return komorka;

    }
    //-----------------------------------------------


    //-----------------------------------------------

}
