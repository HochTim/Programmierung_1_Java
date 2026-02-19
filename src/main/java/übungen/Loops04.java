package übungen;

import java.util.Scanner;

public class Loops04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String string1, string2;

		System.out.print("Gib bitte die erste Zeichenkette ein: ");
		string1 = scanner.nextLine();
		System.out.print("Gib bitte die zweite Zeichenkette ein: ");
		string2 = scanner.nextLine();
		int testvariable = 0;

		if (string1.length() != string2.length()) {
			System.out.println("Die eingegebenen Zeichenketten sind nicht Identisch");
		} else {

			for (int i = 0; i < string1.length(); i++) {

				char char1 = string1.charAt(i);
				char char2 = string2.charAt(i);

				char1 = Character.toUpperCase(char1);
				char2 = Character.toUpperCase(char2);

				if (char1 != char2) {
					System.out.println("Die eingegebenen Zeichenketten sind nicht Identisch");
					testvariable++;
					break;
				}

			}
			if (testvariable == 0) {
				System.out.println("Die eingegebenen Zeichenketten sind Identisch");
			}
		}
	}

}
