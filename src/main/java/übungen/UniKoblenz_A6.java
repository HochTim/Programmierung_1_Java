package übungen;

import java.util.Scanner;

public class UniKoblenz_A6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gib eine Zahl ein");
		int a = scanner.nextInt();
		
		System.out.print("Gib eine Zahl ein");
		int b = scanner.nextInt();
		
		int c = a;
		
		a = b;
		
		b = c;
		
		System.out.println("a = "+a+" b = "+b);
		
		
	}

}
