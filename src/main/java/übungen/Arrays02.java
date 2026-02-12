package übungen;

import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("bitte gib die Anzahl deiner Zahlen ein: " );
		int numberOfNumbers = scanner.nextInt();
		int[] arrayOfUser = new int[numberOfNumbers];
		int userNumber;
		int shortmemory = 0;
		
		
		for ( int i = 0; i < arrayOfUser.length; i++ ) {
			System.out.print("Geben Sie bitte die (nächste) Zahl: ");
			userNumber = scanner.nextInt();
			arrayOfUser[i] = userNumber;
		}
		
		for (int i = 0; i < arrayOfUser.length/2; i++) {
			shortmemory = arrayOfUser[i] ;
			arrayOfUser[i] = arrayOfUser[arrayOfUser.length - (i+1)];
			arrayOfUser[arrayOfUser.length - (i+1)] = shortmemory;
		}
		
		for (int i = 0; i < arrayOfUser.length; i++) {
			System.out.println(arrayOfUser[i]);
		}
		

	}

}
