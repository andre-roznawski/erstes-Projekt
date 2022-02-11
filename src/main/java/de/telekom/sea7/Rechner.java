package de.telekom.sea7;

public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Hallo User, bitte gib eine Zahl ein:");
        String eingabe1 = System.console().readLine();
        int zahl1 = Integer.parseInt(eingabe1);
        
        System.out.print("Hallo User, bitte gib eine weitere Zahl ein:");
        String eingabe2 = System.console().readLine();
        int zahl2 = Integer.parseInt(eingabe2);
        
        System.out.println("Was moechtest du mit den Zahlen machen?");
        System.out.println("plus"+" "+"minus"+" "+"mal"+" "+"geteilt");
        
        String abfrage = System.console().readLine();
        
        int ergebnis;
        while (true) {
        switch (abfrage){
        case "plus": 
        	ergebnis = zahl1 + zahl2;
        	System.out.println("Das Ergebnis ist:"+ " " +ergebnis);
            break;
        case "minus": 
        	ergebnis = zahl1 - zahl2;
        	System.out.println("Das Ergebnis ist:"+ " " +ergebnis);
            break;
        case "mal": 
        	ergebnis = zahl1 * zahl2;
        	System.out.println("Das Ergebnis ist:"+ " " +ergebnis);
            break;
        case "geteilt": 
        	ergebnis = zahl1 / zahl2;
        	System.out.println("Das Ergebnis ist:"+ " " +ergebnis);
            break;
        default:
        	System.out.println("Bitte überprüfe nochmals deine Eingabe, und gebe erneut ein.");
                     
        }
     }
	}
}
