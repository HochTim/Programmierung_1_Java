package übungen;

import java.util.Scanner;

public class Cases06 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nachName, solution;
		char gender;
		
		System.out.print("Gib bitte deinen Nachnamen ein: ");
		nachName = scanner.next();
		System.out.print("Gib bitte dein Geschlecht ein (m, w, d): ");
		gender = scanner.next().charAt(0);
		
		switch (gender) {
		case 'm': solution = "Herr";
		break;
		case 'w': solution = "Frau";
		break;
		default: solution ="";
		}
		
		System.out.println("Hallo " + solution + " " + nachName);
		
		
		
		
		
	}

}
