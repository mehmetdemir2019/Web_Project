package com.mergeCons.egitim.util;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Adres implements Serializable {
	
	
	private String cadde;
	private String sokak;
	
	
	
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getSokak() {
		return sokak;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}


}