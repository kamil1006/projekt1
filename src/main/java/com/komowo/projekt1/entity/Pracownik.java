package com.komowo.projekt1.entity;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity(name="PRACOWNIK")
@Table(name="PRACOWNIK")
public class Pracownik {
	
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY) default value
	@Column(name="nr_kadrowy")
	private String nrKadrowy;
	
	@Column(name="nazwisko")
	private String nazwisko;
	
	@Column(name="imie")
	private String imie;
	
	@Column(name="pesel")
	private int pesel;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="data_wpisu")
	private Date dataWpisu;
	
	//---------------------------------------------------------------------------
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pracownik_dodatkowe")
	private PracownikDodatkowe pracownikDodatkowe;



	//---------------------------------------------------------------------------
	@ManyToMany(fetch=FetchType.LAZY,
			cascade= {CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="PRAC_MED",
			joinColumns=@JoinColumn(name="nr_kadrowy"),
			inverseJoinColumns=@JoinColumn(name="id_medalu")
	)
	private List<Medal> medale;

	//---------------------------------------------------------------------------

	@OneToMany(fetch=FetchType.LAZY,
			mappedBy="pracownik",
			cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Zatrudnienie> zatrudnienie;

	//---------------------------------------------------------------------------


	public Pracownik() {
	}


	//---------------------------------------------------------------------------
	
}
