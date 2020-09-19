package com.komowo.projekt1.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity//(name="grupy")
@Table(name="KOMORKI")
public class Komorka {
	
	
	//---------------------------------------------------------------------------
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)// default value
			@Column(name="id")
			private int id;
			
			@Column(name="symbol")
			private String symbol;
			
			
			@Column(name="nazwa")
			private String nazwa;
			
			@Column(name="grupowanie")
			private String grupowanie;
			
			@Column(name="podleglosc_symbol")
			private String podlegloscSymbol;
			//---------------------------------------------------------------------------

	@OneToMany(fetch=FetchType.LAZY,
			mappedBy="komorka",
			cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Zatrudnienie> zatrudnienie;



	//---------------------------------------------------------------------------
}
