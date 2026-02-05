package main;

import java.util.Random;

/**
 * Calculations and Pseudo Random Numbers
 * 
 */

public class D08_CalculationsAndPseudoRandomNumbers {

	public static void main(String[] args) {
		/* Mathematischen Berechnungen*/
		double result = Math.sqrt(64);
		
		System.out.println("result: " + result);
		
		/* Pseudozufallszahlen*/
		int randomNumber;
		
		randomNumber = (int) (Math.random() * 100) + 1;
		System.out.println("randomNumber: " + randomNumber);
		
		Random random = new Random();
		randomNumber = random.nextInt(0, 101); // Da die obere grenze Exclusive ist	
		System.out.println("randomNumber: " + randomNumber);
		
		

	}

}
