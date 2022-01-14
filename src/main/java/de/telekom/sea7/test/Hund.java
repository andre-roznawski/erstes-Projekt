package de.telekom.sea7.test;

public class Hund {

	String Rasse;
	String Farbe;
	int Preis;
	

	public Hund (String Rasse, String Farbe, int Preis) {
		this.Rasse = Rasse;
		this.Farbe = Farbe;
		this.Preis = Preis;
	}

	public String getRasse() {
		return Rasse;
	}

	public void setRasse(String rasse) {
		Rasse = rasse;
	}

	public String getFarbe() {
		return Farbe;
	}

	public void setFarbe(String farbe) {
		Farbe = farbe;
	}

	public int getPreis() {
		return Preis;
	}

	public void setPreis(int preis) {
		Preis = preis;
	}
	/*public Hund getHund() {
		return hund;
	}
	public void setHund(Hund Hund) {
		this.hund = hund;
	}*/

}
