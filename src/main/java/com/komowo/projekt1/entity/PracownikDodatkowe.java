package com.komowo.projekt1.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name="PRACOWNIK_DODATKOWE")
@Table(name="PRACOWNIK_DODATKOWE")
public class PracownikDodatkowe {
	
	
	//---------------------------------------------------------------------------
		@Id
		//@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private String nr;
		
		@Column(name="adres")
		private String adres;
		
		@Column(name="mail_prywatny")
		private String mailPrywatny;
		
		@Column(name="telefon_kontaktowy")
		private String telefonPrywatny;
		
		@Column(name="data_wpisu")
		private Date dataWpisu;
		//---------------------------------------------------------------------------
		
		@OneToOne(mappedBy="pracownikDodatkowe",
				cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
		private Pracownik pracownik;
		//---------------------------------------------------------------------------

		public PracownikDodatkowe() {
			//---------------------------------------------------------------------------

		}
		public PracownikDodatkowe(String nr, String adres, String mailPrywatny, String telefonPrywatny, Date dataWpisu,
				Pracownik pracownik) {
			super();
			this.nr = nr;
			this.adres = adres;
			this.mailPrywatny = mailPrywatny;
			this.telefonPrywatny = telefonPrywatny;
			this.dataWpisu = dataWpisu;
			this.pracownik = pracownik;
		}
		//---------------------------------------------------------------------------
		public String getNr() {
			return nr;
		}
		public void setNr(String nr) {
			this.nr = nr;
		}
		public String getAdres() {
			return adres;
		}
		public void setAdres(String adres) {
			this.adres = adres;
		}
		public String getMailPrywatny() {
			return mailPrywatny;
		}
		public void setMailPrywatny(String mailPrywatny) {
			this.mailPrywatny = mailPrywatny;
		}
		public String getTelefonPrywatny() {
			return telefonPrywatny;
		}
		public void setTelefonPrywatny(String telefonPrywatny) {
			this.telefonPrywatny = telefonPrywatny;
		}
		public Date getDataWpisu() {
			return dataWpisu;
		}
		public void setDataWpisu(Date dataWpisu) {
			this.dataWpisu = dataWpisu;
		}
		public Pracownik getPracownik() {
			return pracownik;
		}
		public void setPracownik(Pracownik pracownik) {
			this.pracownik = pracownik;
		}
		@Override
		public String toString() {
			return "PracownikDodatkowe [nr=" + nr + ", adres=" + adres + ", mailPrywatny=" + mailPrywatny
					+ ", telefonPrywatny=" + telefonPrywatny + ", dataWpisu=" + dataWpisu + "]";
		}
		
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
}
