package de.telekom.sea7;

public class Uebung_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    int i= -10;
    while (i<=10) {
    	System.out.println(i);
    	i = i + 2;
	}
        for (int a = -10; a<=10; a= a+2) {
    	System.out.println(a);	
    }
    int b = 1;
    int c = 0;
    while (c<60) {
    	System.out.println(c);
    	c = b * b;
    	b = b + 1;
       	}
    for (int d = 1; d <65; d = d*2) {
    	System.out.println(d);
    }
    int e = 0;
    int f = 1;
    while (e<100) {
    	System.out.println(e);
    	e = e + f;
    	f ++;
    
    }
    int h =1;
    for ( int g = 1; g < 100; g = g + h) {
    	System.out.println(g);
    	h ++;
    }
    
    	}
}
