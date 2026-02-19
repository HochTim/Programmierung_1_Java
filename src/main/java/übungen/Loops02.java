package übungen;

import java.util.Scanner;

public class Loops02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfUser, counter;
		System.out.print("Bitte geben Sie eine Ganze Zahl ein: ");
		numberOfUser = scanner.nextInt();
		
		counter = 0;
				
		
		for(int i = 1; i <= numberOfUser; i++) {
			if(numberOfUser % i == 0) {
				counter++;
			}
		}
		
		if(counter == 2) {
			System.out.println("Ergebnis: Die eingegebene Zahl ist eine Primzahl");
			
		} else {
			System.out.println("Ergebnis: Die eingegebene Zahl ist Keine Primzahl");
		}
		
		
		
	}

}
