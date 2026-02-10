package main;

import java.util.Scanner;

public class D13_ConditionalBranches {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte gib dein Alter ein: ");
		int age = scanner.nextInt();
		
		String ageText;
		if (age < 18) {
			ageText = "Minderjährig";
		} else {
			ageText = "Volljährig";
		}
		System.out.println("Du bist " + ageText);
		
		String ageAsText = (age < 18) ? "Minderjährig" : "Volljahrig";
		System.out.println("Du bist " + ageAsText);
		

	}

}
