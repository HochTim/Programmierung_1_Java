package übungen;

import java.util.Scanner;

public class Arrays02_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int lengthOfArray, valueOfArray, shortMemory;
		
		System.out.print("Geben Sie bitte die Anzahl der Nummern an: ");
		lengthOfArray = scanner.nextInt();
		
		int[] arrayOfUser = new int[lengthOfArray];
		
		for ( int i = 0; i < arrayOfUser.length; i++) {
			
			System.out.println("Bitte gib die (nächste) Ziffer ein: ");
			valueOfArray = scanner.nextInt();
			
			arrayOfUser[i] = valueOfArray;
			
		}
		
		for ( int i = 0; i < arrayOfUser.length/2; i++) {
			
			shortMemory = arrayOfUser[i];
			arrayOfUser[i] = arrayOfUser[arrayOfUser.length - (1+i)];
			arrayOfUser[arrayOfUser.length - (1+i)] = shortMemory;
			
		}
		for ( int i = 0; i < arrayOfUser.length; i++) {
		System.out.println(arrayOfUser[i]);
		}

	}
	

}
