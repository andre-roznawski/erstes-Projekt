package de.telekom.sea7;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hallo User, bitte gib deinen Namen ein:");
        String eingabe = System.console().readLine();
        System.out.println("Hallo" + " " + eingabe +"! Schön das du da bist.");
        System.out.println(eingabe + "," + " " + "wie geht es dir?");
        String abfrage = System.console().readLine();
        switch (abfrage){
        case "gut": 
        	System.out.println("Hey cool, das freut mich aber sehr!");
            break;
        default:
        	System.out.println("Das ist aber schade, gute Besserung.");
            break;
        }
     }

}
