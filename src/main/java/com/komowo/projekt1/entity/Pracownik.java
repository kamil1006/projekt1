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

	public String getNrKadrowy() {
		return nrKadrowy;
	}

	public void setNrKadrowy(String nrKadrowy) {
		this.nrKadrowy = nrKadrowy;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public int getPesel() {
		return pesel;
	}

	public void setPesel(int pesel) {
		this.pesel = pesel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getDataWpisu() {
		return dataWpisu;
	}

	public void setDataWpisu(Date dataWpisu) {
		this.dataWpisu = dataWpisu;
	}
	//---------------------------------------------------------------------------

	public PracownikDodatkowe getPracownikDodatkowe() {
		return pracownikDodatkowe;
	}

	public void setPracownikDodatkowe(PracownikDodatkowe pracownikDodatkowe) {
		this.pracownikDodatkowe = pracownikDodatkowe;
	}

	//---------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Pracownik{" +
				"nrKadrowy='" + nrKadrowy + '\'' +
				", nazwisko='" + nazwisko + '\'' +
				", imie='" + imie + '\'' +
				", pesel=" + pesel +
				", mail='" + mail + '\'' +
				", dataWpisu=" + dataWpisu +
				'}';
	}


	//---------------------------------------------------------------------------

}
