package hafta3_lab;

import java.util.List;
import java.util.ArrayList;

public class MusteriBean {
	
	private Musteri musteri = new Musteri();
	
	private List<Musteri> liste = new ArrayList<Musteri>();

	public void kaydet() {
		System.out.println(getMusteri().getAd() + " " + getMusteri().getSoyad() + " " + getMusteri().getYas() + " "
				+ getMusteri().getCinsiyet() + " " + getMusteri().getSehir());
		
		getListe().add(musteri);
		musteri = new Musteri();
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public List<Musteri> getListe() {
		return liste;
	}

	public void setListe(List<Musteri> liste) {
		this.liste = liste;
	}
	
	
}