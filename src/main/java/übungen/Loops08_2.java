package übungen;

import java.util.Scanner;

public class Loops08_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int k0, kN, numberOfYears;
		double p;

		while (true) {

			System.out.print("Bitte gib das Startkapital in Euro ein: ");
			k0 = scanner.nextInt();
			System.out.print("Bitte gib die Anzahl der Jahre ein: ");
			numberOfYears = scanner.nextInt();
			System.out.print("Bitte gib den Prozentsatz ein: ");
			p = scanner.nextDouble();

			kN = k0;

			for (int i = 1; i <= numberOfYears; i++) {

				kN *= (1 + (p / 100));

			}

			System.out.println("Ergebnis: Das Endkapital beträgt " + kN + "€");

			System.out.print("Willst du eine weitere Zinsrechnung durchführen (true oder false)?: ");
			if (!scanner.nextBoolean()) {

				break;

			}

		}

	}

}
