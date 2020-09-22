package com.komowo.projekt1.repository;

import com.komowo.projekt1.entity.Grupa;
import com.komowo.projekt1.entity.Pracownik;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class PracownikRepository2 {
//---------------------------------------------------------

    @Autowired
    EntityManager em;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


//---------------------------------------------------------
    public Pracownik findById(String id){
        return em.find(Pracownik.class,id);
    }


    //---------------------------------------------------------
        public List<Pracownik> findAll(){
             return em.createQuery("select g from Pracownik g",Pracownik.class).getResultList();
        }

    //---------------------------------------------------------
    public   void zapisz(Pracownik pracownik){
        if(pracownik.getNrKadrowy()==null) {
            //zapisz
            em.persist(pracownik);
        }
        else
        {
            em.merge(pracownik);
        }

    }

    //---------------------------------------------------------

}
