package übungen;

import java.util.Scanner;

public class UniKoblenz_A4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geben Sie bitte ihren Vornamen ein");
		String vorname = scanner.next();
		System.out.print("Geben Sie bitte ihren Nachnamen ein");
		String nachname = scanner.next();
		
		System.out.println(vorname +" "+ nachname);
		
		
	}

}
