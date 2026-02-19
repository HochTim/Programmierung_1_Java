package übungen;

import java.util.Scanner;

public class Cases02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int operant1, operant2;
		double solution = 0;
		char operator;
		
		System.out.print("Bitte geben Sie die erste Zahl ein: ");
		operant1 = scanner.nextInt();
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		operant2 = scanner.nextInt();
		System.out.print("Bitte geben Sie den Rechenoperator ein: ");
		operator = scanner.next().charAt(0);
		
		switch (operator){
		case '+': solution = operant1 + operant2;
		break;
		case '-': solution = operant1 - operant2;
		break;
		case '*': solution = operant1 * operant2;
		break;
		case '/': solution = (double) operant1 / operant2;
		break;
			
		}
		
		System.out.println("Ergebnis: " + operant1 + operator + operant2 + " = " + solution );
		
	}

}
