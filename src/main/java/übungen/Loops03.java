package übungen;

import java.util.Scanner;

public class Loops03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String string1;
		char letter;
		int counter = 0;
		double percentage;
		
		System.out.print("Gib bitte eine Zeichenkette ein: ");
		string1 = scanner.nextLine();
		
		System.out.print("Gib bitte das zu analysierende Zeichen ein: ");
		letter = scanner.next().charAt(0);
		
		for (int i = 0; i < string1.length(); i++) {
			if(string1.charAt(i) == letter) {
				counter++;
			}
		}
		
		percentage = (double) counter / string1.length();
		
		percentage = percentage * 100;
		
		System.out.println("Absoluter Anteil: " + counter);
		System.out.println("Prozentualer Anteil: " + percentage + "%");
		
	}

}