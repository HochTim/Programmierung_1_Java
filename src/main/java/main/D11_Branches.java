package main;

import java.util.Scanner;

public class D11_Branches {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte Dein Alter eingeben");
		int age = scanner.nextInt();

		/* Einfachverzweigung */
		if (age < 18) {
			System.out.println("Du bist Minderjährig");
		}

		else {
			System.out.println("Du bist Volljährig");
		}

		/* Verschachtelte Verzweigungen */
		if (age < 12) {
			System.out.println("Du bist ein Kind");
		} else if (age < 18) {
			System.out.println("Du bist ein Jugendlicher");
		} else if (age < 65) {
			System.out.println("Du bist ein Erwachsener");
		} else {
			System.out.println("Du bist nicht mehr der Jüngste xD");
		}
		
		/* Vergleichs_Operatoren: >, >=, <, <=, ==, != */
		/* Logische Operatoren: &&(logisches Und), ||(Logisches Oder), !(Logische Verneinung)*/
		
		
		/*Lazy Evaluation*/
		System.out.print("Bitte Geschlecht eingeben");
		char gender = scanner.next().charAt(0);
		if (gender == 'W' && ++age >= 18 ) {
			System.out.println("Viel Spaß auf der Party ");
		}
		System.out.println(age);
		/* Männer werden hier nicht Inkrementiert da der kompiler aufhört die und Bedingung durchzugehen wenn der Linke 
		 * part false ist, denn wenn der Linke part false ist wird bei und immer der ganze ausdruck false sein 
		 */
	}

}
