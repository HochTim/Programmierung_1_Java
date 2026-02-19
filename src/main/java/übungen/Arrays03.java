package übungen;

import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] isbn = new int[12];

		String numbers;

		int checkingNumber = 0;

		System.out.print("Gib bitte eine ISBN ohne Prüfziffer ein: ");
		numbers = scanner.next();

		for (int i = 0; i < isbn.length; i++) {

			isbn[i] = Character.getNumericValue(numbers.charAt(i));

			if (i % 2 == 0) {

				checkingNumber += isbn[i];

			} else {

				checkingNumber += isbn[i] * 3;
			}

		}
		
		System.out.println(checkingNumber);

		checkingNumber = 10 - (checkingNumber % 10);

		System.out.println("Die Prüfziffer lautet: " + checkingNumber);

	}

}
