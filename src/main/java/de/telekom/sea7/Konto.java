package de.telekom.sea7;

public class Konto {

	private String empfaenger;
	private String iban;
	private float betrag;
	private String verwendungszweck;
	private boolean echtzeitueberweisung;

	public String getEmpfaenger() {
		return empfaenger;
	}

	public void setEmpfaenger(String empfaenger) {
		this.empfaenger = empfaenger;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		if (iban.startsWith("DE")) {
			this.iban = iban;
		} else {
			System.out.println("Im Moment funktioniert dieses Programm nur mit deutschen IBANs");
		}
	}

	public float getBetrag() {
		return betrag;
	}

	public void setBetrag(float betrag) {
		this.betrag = betrag;
	}

	public String getVerwendungszweck() {
		return verwendungszweck;
	}

	public void setVerwendungszweck(String verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}

	public boolean getEchtzeitueberweisung() {
		return echtzeitueberweisung;
	}

	public void setEchtzeitueberweisung(boolean echtzeitueberweisung) {
		this.echtzeitueberweisung = echtzeitueberweisung;
	}

}
