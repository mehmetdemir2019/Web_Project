package com.mergeCons.egitim.util;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Anahtar implements Serializable {
	
	private String ulkeNo;
	private String kimlikNo;
	
	
	
	
	public String getUlkeNo() {
		return ulkeNo;
	}
	public void setUlkeNo(String ulkeNo) {
		this.ulkeNo = ulkeNo;
	}
	public String getKimlikNo() {
		return kimlikNo;
	}
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	
	

}