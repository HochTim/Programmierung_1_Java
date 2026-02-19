package übungen;

import java.util.Scanner;

public class Loops08 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int k0, kN, numberOfYears;
		double p, growthFaktor;
		
		while(true) {
		
		System.out.print("Gib bitte das Startkapital ein (in Euro): " );
		k0 = scanner.nextInt();
		System.out.print("Gib bitte die Anzahl der Jahre ein: " );
		numberOfYears = scanner.nextInt();
		System.out.print("Gib bitte den Prozentsatz ein: " );
		p = scanner.nextDouble();
		
		kN = k0;
		growthFaktor = 1 + p/100;
		
		for (int i = 1; i <= numberOfYears; i++) {
			kN = (int) (kN * growthFaktor);
			
		}

		
		System.out.println("Ergebnis: Das Endkapital beträgt " + kN + "€");
		
		if(!scanner.nextBoolean()) {
			System.out.println("Das Programm wird nun Beendet");
			break;
		}
		}
		
	}

}
