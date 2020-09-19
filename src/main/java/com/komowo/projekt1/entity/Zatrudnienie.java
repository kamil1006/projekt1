package com.komowo.projekt1.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity//(name="grupy")
@Table(name="ZATRUDNIENIE")
public class Zatrudnienie {
	//---------------------------------------------------------------------------

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //default value
	@Column(name="id")
	private int id;
	
	@Column(name="data_od")
	private Date dataOd;
	
	@Column(name="data_do")
	private Date dataDo;


	@Column(name="wymiar")
	private int wymiarEtatu;

	//---------------------------------------------------------------------------


	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="id_komorka")
	private Komorka komorka;



	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="id_grupy")
	private Grupa grupa;



	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="id_stanowiska")
	private Stanowisko stanowisko;


	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="nr_kadrowy")
	private Pracownik pracownik;



	//---------------------------------------------------------------------------

}
