package main;

import java.util.Scanner;

public class D14_Cases {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte gib \"r\", \"g\" oder \"b\" ein: ");
		char color = scanner.next().charAt(0);

		String colorText;
		if (color == 'r' || color == 'R') {
			colorText = "rot";
		} else if (color == 'g' || color == 'G') {
			colorText = "grün";
		} else if (color == 'b' || color == 'B') {
			colorText = "blau";
		} else {
			colorText = "";
		}
		System.out.println(colorText);

		switch (color) {
		case 'r':
		case 'R':
			colorText = "rot";
			break;
		case 'g':
		case 'G':
			colorText = "grün";
			break;
		case 'b':
		case 'B':
			colorText = "blau";
			break;
		default:
			colorText = "";
		}

		System.out.println(colorText);
		
		colorText = switch (color) {
		case 'r', 'R' -> "rot";
		case 'g', 'G' -> "grün";
		case 'b', 'B' -> "blau";
		default -> "";
		};
		System.out.println(colorText);

	}

}
