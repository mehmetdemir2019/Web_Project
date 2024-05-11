package com.mergeCons.egitim.util;

import java.util.List;

import javax.persistence.EntityManager;


public class RezervasyonView {

	private Rezervasyon rezervasyon = new Rezervasyon();

	public void kaydet() {
		System.out.println(getRezervasyon().getAd() + " " +getRezervasyon().getSoyad() + " " + getRezervasyon().getYas() + " "
				+ getRezervasyon().getCinsiyet() + " " + getRezervasyon().getSehir()+ " " + getRezervasyon().getOdaTipi()+ " " + getRezervasyon().getOdaTipi());
	
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(rezervasyon);
		en.getTransaction().commit();
		rezervasyon = new Rezervasyon();

	}

	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(rezervasyon);
		en.getTransaction().commit();
		rezervasyon = new Rezervasyon();

	}

	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(rezervasyon);
		en.getTransaction().commit();
		rezervasyon = new Rezervasyon();

	}

	public List<Rezervasyon> getListe() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("From Rezervasyon").getResultList();

	}

	public Rezervasyon getRezervasyon() {
		return rezervasyon;
	}

	public void setRezervasyon(Rezervasyon rezervasyon) {
		this.rezervasyon = rezervasyon;
	}
	
	

}
