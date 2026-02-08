package übungen;

import java.util.Scanner;

public class UniKoblenz_07 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gib eine Zahl ein");
		int a = scanner.nextInt();
		
		System.out.print("Gib eine Zahl ein");
		int b = scanner.nextInt();
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		
		System.out.println("a = "+a+" b = "+b);
		
		
	}

}