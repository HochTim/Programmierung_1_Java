package übungen;

import java.util.Scanner;

public class Loops06 {
	

	
	public static int calculator(int k0, double percentage ) {
		int z = (int) (k0 * (percentage/100));
		return z;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int k0, kN, z = 0;
		double percentage;
		boolean check = true;
		
		while(true ) {
		
		System.out.print("Gib bitte das Startkapital ein: ");
		k0 = scanner.nextInt();
		System.out.print("Gib bitte den Zinsatz ein: ");
		percentage = scanner.nextDouble();
		
		z = calculator(k0, percentage);
		
		System.out.println("Ergebnis: der Jahreszins beträgt: " + z + "€");
		
		System.out.print("Willst du einen weiteren Jahreszins berechnen (true oder false)?: ");
		if(!scanner.nextBoolean()) {
			System.out.println("Der Zinsrechner wird nun beendet.");
			break;
		}
		
		
	}

}
}