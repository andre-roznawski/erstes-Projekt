package de.telekom.sea7.test;

public class MainHund {

	public static void main(String[] args) {
		
		Hund hund = new Hund ("Labrador", "schwarz", 1000);
		//Hund hund1 = new Hund ("Boxer", "braun", 5000)
		
		System.out.println(hund.getRasse());
		System.out.println(hund.getFarbe());
		System.out.println(hund.getPreis());	
		//System.out.println(hund1.getPreis());
				
		hund.setPreis(2000);
		System.out.println("Der neue Preis von diesem Hund ist: " +hund.getPreis());
	}

}
