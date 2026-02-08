package übungen;

import java.util.Locale;
import java.util.Scanner;

public class ConsolApplications02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gib bitte eine Ganze Zahl ein");
		int zahl1 = scanner.nextInt();
		
		System.out.println();
		
		System.out.print("Bitte gib eine weitere Zahl ein");
		int zahl2 = scanner.nextInt();
		
		double Ergebnis;
		
		Ergebnis = (double) zahl1 / zahl2 * 100;
		
		System.out.println();
		
		System.out.printf(Locale.GERMANY,"%d %s %d %s %.2f %s", zahl1, " von ", zahl2, "sind", Ergebnis,"%" );
		
		
	}

}
