package übungen;

import java.util.Random;
import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = random.nextInt(1, 101);
		int numberOfUser;
		int roundCounter = 0;
		
		while(true) {
			roundCounter++;
			System.out.print("Gib bitte Deinen Tipp ein: ");
			numberOfUser = scanner.nextInt();
			if (numberOfUser == randomNumber) {
				System.out.println("Richtig, Du hast " + roundCounter + " Versuche benötigt");
				break;
			} else if(numberOfUser < randomNumber) {
				System.out.println("Die Gesuchte Zahl ist größer");
			}else if(numberOfUser > randomNumber) {
				System.out.println("Die Gesuchte Zahl ist Kleiner");
			}
			System.out.print("Willst du noch eine Runde Spielen(true oder false):  ");
			if (!scanner.nextBoolean()) {
				System.out.println("Das Spiel wird nun beendet. Die gesuchte Zahl betrug: " + randomNumber);
				break;
			}
			
			
		}
		
		

	}

}
