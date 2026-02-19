package übungen;

import java.util.Scanner;

public class Cases01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numberOfUser;
		
		System.out.print("Gib bitte eine ganze Zahl ein: ");
		numberOfUser = scanner.nextInt();
		
		int test = numberOfUser % 2;
		String solution;
		
		if(test != 0) {
			solution = "ungerade";
		} else {
			solution = "gerade";
		}
		
		System.out.println("Ergebnis: Die eingegebene Zahl ist " + solution);
		
	}

}
