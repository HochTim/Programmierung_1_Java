package main;

/**
 * Data Objects
 * 
 * 
 */

public class D04_DataObjects {
	
	/* Konstanten */
	
	public final static double PI = 3.14159265359;

	public static void main(String[] args) {
		
		/* Deklaration */
		
		int age;
		String name, firstName, familyName, firstNameAndFamilyName;
		double SizeInM;
		boolean isMale;
		
		/* Initialisierung */
		age = 18;
		firstName = "Tim";
		SizeInM = 1.79;
		isMale = true;
		
		/* Ausgabe */
		
		System.out.println("age: " + age);
		System.out.println("firstName: " + firstName);
		System.out.println("sizeInM: " + SizeInM);
		System.out.println("isMale: " + isMale);
		
		System.out.println("PI: " + D04_DataObjects.PI);
		
		/* Veränderliche Datenobjekte */
		age = 44;
		System.out.println("age: " + age);
		
		/* Unveränderliche Datenobjekte */
		final String text = "Java";
//		 text = "Python"; Funktioniert nicht da text final ist
		
		/* Sichtbarkeit von Datenobjekten */
//		i = 8; geht nicht da die Methode die Variable i nicht kennt
//		x = 3;
		System.out.println(PI);


	}
	
	public static void doSomething(int x) {
		int i = 5;
		System.out.println(i);
		System.out.println(PI);
		
	}

}
