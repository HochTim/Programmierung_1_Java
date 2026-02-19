package übungen;

import java.util.Random;
import java.util.Scanner;

public class Cases04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numberOfPlayer1, numberOfPlayer2, randomNumber;
		String solution;
		
		System.out.print("Spieler 1, gib bitte Deinen Tipp ein: ");
		numberOfPlayer1 = scanner.nextInt();
		System.out.print("Spieler2, gib bitte Deinen Tipp ein: ");
		numberOfPlayer2 = scanner.nextInt();
		
		randomNumber = random.nextInt(1, 101);
		
		numberOfPlayer1 = randomNumber - numberOfPlayer1;
		numberOfPlayer2 = randomNumber - numberOfPlayer2;
		
		numberOfPlayer1 = Math.abs(numberOfPlayer2);
		numberOfPlayer2 = Math.abs(numberOfPlayer2);
		
		if (numberOfPlayer1 < numberOfPlayer2) {
			solution = "1 gewinnt";
		} else {
			solution = "2 gewinnt";
		}
		System.out.println("Zufallszahl: " + randomNumber + ", Spieler " + solution);
		
		
		
		
		
	}

}
