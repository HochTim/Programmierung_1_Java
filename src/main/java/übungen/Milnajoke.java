package übungen;

import java.util.Scanner;

public class Milnajoke {

	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Gib bitte dein Alter ein: ");
			int age = scanner.nextInt();

			int hands = age / 5;

			if (hands < 4) {
				System.out.println("Hervoragend, du bist sehr Jung");
			} else {
				System.out.println("Du bist (über) " + hands + " Hände Alt und damit sehr ALT");
			}

		}
	}
}
