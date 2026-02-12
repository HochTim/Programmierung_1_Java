package übungen;

import java.util.Scanner;

public class Cases03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gib bitte den ersten Operanten ein: ");
		int number1 = scanner.nextInt();
		System.out.print("Gib bitte den zweiten Operanten ein: ");
		int number2 = scanner.nextInt();
		System.out.print("Welche der 4 Grundrechnarten willst du zur Verrechnung nutzen? ( +, -, *, /): ");
		char operator = scanner.next().charAt(0);
		
		int solution;
		double solutiondevide;
		
		switch(operator) {
		case '+': solution = number1 + number2;
		System.out.println("Ergebnis :" + number1 + operator + number2 + " = " + solution);
		break;
		case '-': solution = number1 - number2;
		System.out.println("Ergebnis :" + number1 + operator + number2 + " = " + solution);
		break;
		case '*': solution = number1 * number2;
		System.out.println("Ergebnis :" + number1 + operator + number2 + " = " + solution);
		break;
		case '/': solutiondevide = (double) number1 / number2;
		System.out.println("Ergebnis :" + number1 + operator + number2 + " = " + solutiondevide);
		break;
		
		
	
		}
		
		
		
		
		
		
		

	}

}
