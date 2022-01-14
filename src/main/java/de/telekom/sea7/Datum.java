package de.telekom.sea7;

public class Datum {
	
	private int tag;     //0....31
	private int monat;   //1...12
	private int jahr;    //0....n
	
	// int wochentag;  //1....7
	// boolean schaltjahr;
	
	int getWochentag() {
		return 0;                          //ausrechnen
	}
	int getKalenderwoche() {
		return 0;
	}
	boolean istSchaltjahr(){
		return false;
	}
	boolean istFeiertag () {
		return false;
	}
	boolean istFeiertag(int bundesland) {
		return false;
	}
	public boolean istWochentag() {
		return false;
	}
	public long getFarbe() {
		return 0;                                  //RGB
	}

}
