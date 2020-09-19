package com.komowo.projekt1.repository;

import com.komowo.projekt1.Projekt1Application;
import com.komowo.projekt1.entity.Grupa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;


@SpringBootTest(classes= Projekt1Application.class)
class GrupaRepositoryTest {

    //---------------------------------------------------------
    @Autowired
    GrupaRepository repository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //---------------------------------------------------------
    @Test
    void findByIdTest1(){
        logger.info("testujemy junit find grupa po id");
        Grupa grupa=repository.findById("3");
        assertEquals("Kierownicy administracyjni",grupa.getNazwa());
        logger.info("odczytano ----------> \n"+grupa);

    }
  //---------------------------------------------------------
  @Test
  void findAllTest2(){
      logger.info("testujemy junit find grupa all");
      List<Grupa> grupa=repository.findAll();
      assertEquals(10,grupa.size());
      logger.info("odczytano  tyle wierszy ----------> "+grupa.size());

  }
 //---------------------------------------------------------
    @Test
    @DirtiesContext
    void zapiszTest(){

        logger.info("testujemy junit update");
        Grupa grupa=repository.findById("3");
        grupa.setNazwa("Kierownicy administracyjni");
        repository.zapisz(grupa);

        Grupa grupa2=repository.findById("3");
        assertEquals("Kierownicy administracyjni",grupa2.getNazwa());

    }
//---------------------------------------------------------

}