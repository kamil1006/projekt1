package com.komowo.projekt1.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;







@Entity
@Table(name="GRUPY")
public class Grupa {
	//---------------------------------------------------------------------------

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY) default value
	@Column(name="id_grupy")
	private String idGrupy;
	
	
	@Column(name="nazwa")
	private String nazwa;


//---------------------------------------------------------------------------

	@OneToMany(fetch=FetchType.LAZY,
			mappedBy="grupa",
			cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Zatrudnienie> zatrudnienie;

//---------------------------------------------------------------------------



}
