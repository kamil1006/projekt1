package com.komowo.projekt1.service;

import com.komowo.projekt1.Projekt1Application;
import com.komowo.projekt1.entity.Pracownik;
import com.komowo.projekt1.entity.PracownikDodatkowe;
import com.komowo.projekt1.repository.PracownikDodatkoweRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes= Projekt1Application.class)
class PracownikDodatkoweServiceTest {


    @Autowired
    PracownikDodatkoweRepository repository;

    @Autowired
    EntityManager em;


    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Test
    void findAllService() {
    }

    @Test
    void findByIdService() {

        String id="nr1";
        Optional<PracownikDodatkowe> pracownikDodatkowe1 = repository.findById(id);
        PracownikDodatkowe pracownikDodatkowe = pracownikDodatkowe1.get();

        logger.info("znaleziono -->" +pracownikDodatkowe.toString());
        assertEquals(id,pracownikDodatkowe.getNr());

        pracownikDodatkowe=em.find(PracownikDodatkowe.class,id);
        logger.info("znaleziono -->" +pracownikDodatkowe.toString());
        assertEquals(id,pracownikDodatkowe.getNr());

    }
}