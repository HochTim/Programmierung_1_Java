package übungen;

import java.util.Random;
import java.util.Scanner;

public class E01_ConsoleApplications03 {

	public static int rollTheDice() {
		Random dice = new Random();
		int valueOfDice = dice.nextInt(1, 7);
		return valueOfDice;
	}

	public static int attackValue() {
		int totalAttackValue = 0;
		for (int i = 1; i <= 4; i++) {
			totalAttackValue += rollTheDice();
		}
		return totalAttackValue;
	}

	public static int defenseValue() {
		int totalDefenseValue = 0;
		for (int j = 1; j <= 3; j++) {
			totalDefenseValue += rollTheDice();
		}
		return totalDefenseValue;
	}

	public static int totalDamage(int totalDefenseValue, int totalAttackValue, int healthPointsOfFighter,
			String nameOfDefender) {
		int totalDamage;
		totalDamage = totalAttackValue - totalDefenseValue;
		if (totalDamage < 0) {
			totalDamage = 0;
			System.out.println("Kompletter Schaden wurde Abgeblockt");
		}
		healthPointsOfFighter -= totalDamage;
		if (healthPointsOfFighter <= 0) {
			healthPointsOfFighter = 0;
		}
		System.out.println(
				nameOfDefender + " erleidet " + totalDamage + " Schaden und hat noch " + healthPointsOfFighter + " LP");
		return healthPointsOfFighter;
	}

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* Deklarationen */
		String nameOfPlayer1;
		String nameOfPlayer2;

		String nameOfFighter1;
		int healthPointsOfFighter1;
		String nameOfFighter2;
		int healthPointsOfFighter2;
		int roundCounter = 0;
		boolean checkWetherPlayAnOtherRound;

		while (true) {
			System.out.print("Willst du (noch) eine Runde Spielen? (true oder false) :");
			checkWetherPlayAnOtherRound = scanner.nextBoolean();
			if (checkWetherPlayAnOtherRound == false) {
				System.out.println("Das Spiel wird nun beendet, tyForAllGameFreaks");
				break;
			}
			System.out.println();

			/* Initialisierungen */
			System.out.print("Spieler 1, Name: ");
			nameOfPlayer1 = scanner.next();
			System.out.print("Spieler 1, Kämpfer 1, Name: ");
			nameOfFighter1 = scanner.next();
			System.out.print("Spieler 1, Kämpfer, LP: ");
			healthPointsOfFighter1 = scanner.nextInt();

			System.out.print("Spieler 2, Name: ");
			nameOfPlayer2 = scanner.next();
			System.out.print("Spieler 2, Kämpfer 2, Name: ");
			nameOfFighter2 = scanner.next();
			System.out.print("Spieler 2, Kämpfer, LP: ");
			healthPointsOfFighter2 = scanner.nextInt();

			System.out.println();

			while (healthPointsOfFighter1 > 0 && healthPointsOfFighter2 > 0) {
				roundCounter++;

				System.out.println();
				System.out.println("*----------*");
				System.out.println("* Zug: " + roundCounter + " *");
				System.out.println("*----------*");
				System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + "( "
						+ healthPointsOfFighter1 + " LP )");
				System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + "( "
						+ healthPointsOfFighter2 + " LP )");
				if (roundCounter % 2 == 1) {
					System.out.println(nameOfFighter1 + " greift " + nameOfFighter2 + " an");
					int totalAttackOfFighter1 = attackValue();
					System.out.println(nameOfFighter1 + " erziehlt " + totalAttackOfFighter1 + " Treffer ");
					int totalDefenseOfFighter2 = defenseValue();
					System.out.println(nameOfFighter2 + " blockt " + totalDefenseOfFighter2 + " Treffer ");
					healthPointsOfFighter2 = totalDamage(totalDefenseOfFighter2, totalAttackOfFighter1,
							healthPointsOfFighter2, nameOfFighter2);

				} else {
					System.out.println(nameOfFighter2 + " greift " + nameOfFighter1 + " an");
					int totalAttackOfFighter2 = attackValue();
					System.out.println(nameOfFighter1 + " erziehlt " + totalAttackOfFighter2 + " Treffer ");
					int totalDefenseOfFighter1 = defenseValue();
					System.out.println(nameOfFighter2 + " blockt " + totalDefenseOfFighter1 + " Treffer ");
					healthPointsOfFighter1 = totalDamage(totalDefenseOfFighter1, totalAttackOfFighter2,
							healthPointsOfFighter1, nameOfFighter1);

				}
				System.out.println();
				if (healthPointsOfFighter2 <= 0) {
					System.out.println("Kämpfer: " + nameOfFighter1 + " Gewinnt!");

				} else if (healthPointsOfFighter1 <= 0) {
					System.out.println("Kämpfer: " + nameOfFighter2 + " Gewinnt!");
				}
			}

		}

	}

}
