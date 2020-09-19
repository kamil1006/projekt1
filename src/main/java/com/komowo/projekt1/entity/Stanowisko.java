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
	
}
