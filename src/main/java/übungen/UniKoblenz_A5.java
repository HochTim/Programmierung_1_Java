package übungen;

import java.util.Scanner;

public class UniKoblenz_A5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number1, number2, solution;
		
		System.out.print("Bitte geben sie eine Ganze Zahl ein");
		number1 = scanner.nextInt();
		System.out.print("Bitte geben sie eine weitere Ganze Zahl ein");
		number2 = scanner.nextInt();
		
		solution = number1 + number2;
		
		System.out.println("Das Ergebnis Lautet: "+ solution);
		
		
	}

}
