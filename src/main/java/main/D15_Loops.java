package main;

import java.util.Scanner;

public class D15_Loops {

	public static void main(String[] args) {
		/* while-Schleife (kopfgesteuerte Schleife) */
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();

		/* do-while-Schleife (Fußgesteuerte Schleife) */
		int x = 1;

		do {
			System.out.println(x);
			x++;
		} while (x <= 10);

		/* for-Schleife (Zahlschleife) */

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

		/* Endlosschleife */
		Scanner scanner = new Scanner(System.in);
		int z = 0;

		while (true) {

			System.out.print("Schleife beenden (true oder false)?: ");
			boolean answer = scanner.nextBoolean();
			if (answer == true) { // if(answer)
				break;
			}
			System.out.print("Uhrzeit ausgeben? (true oder false)?:");
			answer = scanner.nextBoolean();
			if (answer == false) {
				continue;
			}
			System.out.println(System.currentTimeMillis());

		}

	}

}
