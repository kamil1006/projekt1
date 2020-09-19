package com.komowo.projekt1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="MEDAL")
public class Medal {
    //---------------------------------------------------------------------------
    @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY) default value
    @Column(name="id")
    private String id;


    @Column(name="nazwa")
    private String nazwa;



    //---------------------------------------------------------------------------

    @ManyToMany(fetch=FetchType.LAZY,
            cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(
            name="PRAC_MED",
            joinColumns=@JoinColumn(name="id_medalu"),
            inverseJoinColumns=@JoinColumn(name="nr_kadrowy")
    )
    private List<Pracownik> pracownicy;


    //---------------------------------------------------------------------------

    public Medal() {
    }


    //---------------------------------------------------------------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    //---------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Medal{" +
                "id='" + id + '\'' +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }


    //---------------------------------------------------------------------------

}
