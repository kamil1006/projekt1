package com.komowo.projekt1.repository;

import com.komowo.projekt1.Projekt1Application;
import com.komowo.projekt1.entity.Pracownik;
import com.komowo.projekt1.service.PracownikService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes= Projekt1Application.class)
public class PracownikRepositoryTest {

    //---------------------------------------------------------

    @Autowired
    PracownikService service;

    @Autowired
    EntityManager em;

    @Autowired
    PracownikRepository2 repository2;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //---------------------------------------------------------
    @Test
    void findAllTestService(){
        logger.info("testujemy junit find grupa all");
        List<Pracownik> pracownicy= service.findAllService();
        assertEquals(20,pracownicy.size());
        logger.info("odczytano  tyle wierszy ----------> "+pracownicy.size());

    }
    //---------------------------------------------------------
    @Test
    void findByIdEm(){
        Pracownik pracownik=em.find(Pracownik.class,"num10");
        logger.info("znaleziono -->" +pracownik.getImie());
    }
    //---------------------------------------------------------
    @Test
    void findAllTestEm(){
        Pracownik pracownicy=em.find(Pracownik.class,"");
    }
    //---------------------------------------------------------
    @Test
    void findByIdR2(){
        Pracownik pracownik=repository2.findById("num10");
        logger.info("znaleziono -->" +pracownik.getImie());
    }
    //---------------------------------------------------------


}
