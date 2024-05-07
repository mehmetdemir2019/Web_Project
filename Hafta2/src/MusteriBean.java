
public class MusteriBean {

	private Musteri musteri = new Musteri() {

	};

	public void kaydet() {

		System.out.println(getMusteri().getAd() + " " + getMusteri().getSoyad() + " " + getMusteri().getCinsiyet() + " "
				+ getMusteri().getYas() + " " + getMusteri().getSehir() + " ");

	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

}
