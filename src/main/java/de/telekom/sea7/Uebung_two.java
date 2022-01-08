package de.telekom.sea7;

public class Uebung_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  int y;
			  int x = 1;
			  int total = 0;
			 
			  do {
			    y = x * x;
			    System.out.println(y);
			    total = total + y;
			    x = x + 1;
			  } while (x <= 5);
			 
			  System.out.println("Total ist: " + total);
			}
}
