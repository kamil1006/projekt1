package com.komowo.projekt1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//(name="grupy")
@Table(name="stanowisko")
public class Stanowisko {
	
	//---------------------------------------------------------------------------
	@Id
	@Column(name="id_stanowiska")
	private String idStanowiska;
	
	
	@Column(name="nazwa")
	private String nazwa;
	//---------------------------------------------------------------------------

	public Stanowisko() {
	}


	//---------------------------------------------------------------------------

	public String getIdStanowiska() {
		return idStanowiska;
	}

	public void setIdStanowiska(String idStanowiska) {
		this.idStanowiska = idStanowiska;
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
		return "Stanowisko{" +
				"idStanowiska='" + idStanowiska + '\'' +
				", nazwa='" + nazwa + '\'' +
				'}';
	}


	//---------------------------------------------------------------------------
	
}
