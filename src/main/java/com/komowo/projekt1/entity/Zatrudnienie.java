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

	public Zatrudnienie() {
	}
	//---------------------------------------------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataOd() {
		return dataOd;
	}

	public void setDataOd(Date dataOd) {
		this.dataOd = dataOd;
	}

	public Date getDataDo() {
		return dataDo;
	}

	public void setDataDo(Date dataDo) {
		this.dataDo = dataDo;
	}

	public int getWymiarEtatu() {
		return wymiarEtatu;
	}

	public void setWymiarEtatu(int wymiarEtatu) {
		this.wymiarEtatu = wymiarEtatu;
	}

	public Komorka getKomorka() {
		return komorka;
	}

	public void setKomorka(Komorka komorka) {
		this.komorka = komorka;
	}

	public Grupa getGrupa() {
		return grupa;
	}

	public void setGrupa(Grupa grupa) {
		this.grupa = grupa;
	}

	public Stanowisko getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(Stanowisko stanowisko) {
		this.stanowisko = stanowisko;
	}

	public Pracownik getPracownik() {
		return pracownik;
	}

	public void setPracownik(Pracownik pracownik) {
		this.pracownik = pracownik;
	}
//---------------------------------------------------------------------------

	@Override
	public String toString() {
		return "Zatrudnienie{" +
				"id=" + id +
				", dataOd=" + dataOd +
				", dataDo=" + dataDo +
				", wymiarEtatu=" + wymiarEtatu +
				'}';
	}


	//---------------------------------------------------------------------------

}
