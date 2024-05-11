package com.mergeCons.egitim.util;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ogrenci implements Serializable {

	
	@EmbeddedId
	private Anahtar anahtar = new Anahtar();
	private String ad;
	private String soyad;
	private Integer yas;
	private String cinsiyet;
	private String sehir;
	private String otel;
	private String odaTipi;
	@Embedded
	private Adres adres = new Adres();

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Integer getYas() {
		return yas;
	}

	public void setYas(Integer yas) {
		this.yas = yas;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getOtel() {
		return otel;
	}

	public void setOtel(String otel) {
		this.otel = otel;
	}

	public String getOdaTipi() {
		return odaTipi;
	}

	public void setOdaTipi(String odaTipi) {
		this.odaTipi = odaTipi;
	}

	

	public Anahtar getAnahtar() {
		return anahtar;
	}

	public void setAnahtar(Anahtar anahtar) {
		this.anahtar = anahtar;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	

}