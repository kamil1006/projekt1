package com.komowo.projekt1.service;

import com.komowo.projekt1.entity.Pracownik;
import com.komowo.projekt1.entity.PracownikDodatkowe;
import com.komowo.projekt1.repository.PracownikDodatkoweRepository;
import com.komowo.projekt1.repository.PracownikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Component
public class PracownikDodatkoweService {
    //-----------------------------------------------
    @Autowired
    PracownikDodatkoweRepository repository;

    @Autowired
    EntityManager em;

    public List<PracownikDodatkowe> findAllService() {

        List<PracownikDodatkowe> pracownicyDodatkowe = repository.findAll();

        return pracownicyDodatkowe;

    }
    //-----------------------------------------------
    public PracownikDodatkowe findByIdService(String id){
          /*
          Optional<PracownikDodatkowe> pracownikDodatkowe1 = repository.findById(id);
        PracownikDodatkowe pracownikDodatkowe= pracownikDodatkowe1.get();
        return pracownikDodatkowe;
        */
        PracownikDodatkowe pracownikDodatkowe=em.find(PracownikDodatkowe.class,id);
        return pracownikDodatkowe;

    }
    //-----------------------------------------------


    //-----------------------------------------------

}
