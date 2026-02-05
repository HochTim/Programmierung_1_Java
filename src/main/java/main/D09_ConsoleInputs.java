package main;

import java.util.Scanner;

/**
 * Consol Inputs
 * 
 * 
 */

public class D09_ConsoleInputs {

	public static void main(String[] args) {
		/*Scanner inititalisierung*/
		Scanner scanner = new Scanner(System.in);
		
		
		/* Werte auslesen und zurückgeben */
		System.out.print("Bitte eine Ganze Zahl eingeben: ");
		int i1 = scanner.nextInt();
		System.out.println("i1: " + i1);
		
		System.out.print("Bitte eine Reelle Zahl eingeben");
		double d1 = scanner.nextDouble();
		System.out.println("d1: " + d1);
		
		System.out.print("Bitte einen Boolschen Warheitswert eingeben");
		boolean b1 = scanner.nextBoolean();
		System.out.println("bi: " + b1);
		
		System.out.print("bitte eine einzelnes Zeichen eingeben");
		char c1 = scanner.next().charAt(0);
		System.out.println("c1: " + c1);
		
		System.out.print("Bitte geben sie ein einzelnes Wort ein: ");
		String s1 = scanner.next();
		System.out.println("s1: " + s1);
		
		System.out.print("Bitte beliebig viele Wörter eingeben");
		scanner.nextLine();
		String s2 = scanner.nextLine();
		System.out.println("s2: " + s2);
	

	}

}
