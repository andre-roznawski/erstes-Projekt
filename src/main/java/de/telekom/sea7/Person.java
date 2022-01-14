package de.telekom.sea7;

public class Person {

	private String vorname;
	private String nachname;
	private String geschlecht;
	private int geb_tag;
	private int geb_monat;
	private int geb_jahr;
	private long steuerID;
	
	public Person(String vorname, String nachname, String geschlecht, int geb_tag, int geb_monat, int geb_jahr, long steuerID) {
		this.vorname=vorname;
		this.nachname=nachname;
		this.geschlecht=geschlecht;
		this.geb_tag=geb_tag;
		this.geb_monat=geb_monat;
		this.geb_jahr=geb_jahr;
		this.steuerID=steuerID;
	}
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	public int getGeb_tag() {
		return geb_tag;
	}
	public void setGeb_tag(int geb_tag) {
		this.geb_tag = geb_tag;
	}
	public int getGeb_monat() {
		return geb_monat;
	}
	public void setGeb_monat(int geb_monat) {
		this.geb_monat = geb_monat;
	}
	public int getGeb_jahr() {
		return geb_jahr;
	}
	public void setGeb_jahr(int geb_jahr) {
		this.geb_jahr = geb_jahr;
	}
	public long getSteuerID() {
		return steuerID;
	}
	public void setSteuerID(long steuerID) {
		this.steuerID = steuerID;
	}
//	public Person getHarry() {
//		return harry;
//	}
	public void setHarry(Person harry) {
//		this.harry = harry;
	}
	
	public boolean equals (Person person) {
		return this.steuerID == person.steuerID;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person harry = new Person ("Harry", "Mueller", "m", 10, 12, 1973, 12345678901l);
		Person eva = new Person ("Eva", "Meier", "w", 22, 8, 1952, 11116543218l);
		System.out.println("Vorname: "+harry.getVorname()+"\nNachname: "+harry.getNachname());
		
		if(harry.equals(eva)) {
			System.out.println (harry.getVorname()+"ist gleich" +eva.getVorname());
		}
		else {
			System.out.println (harry.getVorname()+" ist ungleich " +eva.getVorname());
		}
		
		
	}

}
