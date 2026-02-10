package main;

import java.util.Scanner;

public class D12_StringComparison {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte die Zeichenkette \"true\" eingeben: ");
		
		String input = scanner.next();
		
		if (input == "true") {
			System.out.println("Gut Gemacht");
		} else {
			System.out.println("Leider Flasch");
		}
		
		if (input.equals("true")){
		System.out.println("Richtig");
		} else{
			System.out.println("Flasch");
			
		}
		

	}

}
