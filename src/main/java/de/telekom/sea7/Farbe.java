package de.telekom.sea7;

public class Farbe {
	int rot;
	int gruen;
	int blau;
	
	String getClassName(){
		return "de.telekom.sea7.Farbe";
	}
	public boolean equals(Farbe farbe) {
		if( this.rot == farbe.rot &&
			this.gruen == farbe.gruen && 
			this.blau ==farbe.blau) {
			return true;
		}
		else {
			return false;
		}
	}
}
