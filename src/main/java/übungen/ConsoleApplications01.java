package übungen;

import java.util.Scanner;

public class ConsoleApplications01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gib bitte eine ganze Zahl ein: ");
		int zahl1 = scanner.nextInt();
		
		System.out.println();
		
		System.out.print("Gib bitte eine weitere Zahl ein: ");
		int zahl2 = scanner.nextInt();
		
		int ergebnis = zahl1 + zahl2;
		
		System.out.println();
		
		System.out.println("Ergebnis: "+ zahl1 + "+" + zahl2 +"="+ ergebnis);
		
	}

}
