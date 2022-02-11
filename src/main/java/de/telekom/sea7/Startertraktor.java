package de.telekom.sea7;

public class Startertraktor {

	public static void main(String[] args) {

		Traktor traktor = new TraktorImpl("Fendt", "gruen");
		Traktor traktor1 = new TraktorImpl("Deutz", "grau");
		Traktor traktor2 = new TraktorImpl("Claas", "hellgruen");

		System.out.println(traktor.getMarke() + " " + traktor.getFarbe());
		System.out.println(traktor1.getMarke() + " " + traktor1.getFarbe());
		System.out.println(traktor2.getMarke() + " "+ traktor2.getFarbe());
	}

}
