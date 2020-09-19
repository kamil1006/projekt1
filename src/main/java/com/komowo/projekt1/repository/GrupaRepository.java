package com.komowo.projekt1.repository;

import com.komowo.projekt1.entity.Grupa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Repository
@Transactional
public class GrupaRepository {
//---------------------------------------------------------

    @Autowired
    EntityManager em;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


//---------------------------------------------------------
    public Grupa findById(String id){
        return em.find(Grupa.class,id);
    }


    //---------------------------------------------------------
        public List<Grupa> findAll(){
             return em.createQuery("select g from Grupa g",Grupa.class).getResultList();
        }

    //---------------------------------------------------------
    public   void zapisz(Grupa grupa){
        if(grupa.getIdGrupy()==null) {
            //zapisz
            em.persist(grupa);
        }
        else
        {
            em.merge(grupa);
        }

    }

    //---------------------------------------------------------

}
