package übungen;

import java.util.Scanner;

public class Technische_Hochschule_07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double pi = 3.1415;
		
		System.out.print("Radius: ");
		double radius = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Height: ");
		double height = scan.nextDouble();
		
		double circumfrence = 2 * pi * radius;
		double baseArea = pi * (radius * radius);
		double lateralSurfaceArea = circumfrence * height;
		double surface = 2 * baseArea + lateralSurfaceArea;
		double volume = baseArea * height;
		
		System.out.println("Circumference: " + circumfrence);
		System.out.println("Base Area: " + baseArea);
		System.out.println("Lateral Surface Area: " + lateralSurfaceArea);
		System.out.println("Surface" + surface);
		System.out.println("Volume: " + volume);
		
	}

}
