package main;

import java.util.Locale;

public class D10_ConsolOutputs {

	public static void main(String[] args) {
		/* print- und println-Methoden */
		System.out.println("Text 1");
		System.out.print("Text 2");
		System.out.println("Text 3");
		System.out.println(true);
		System.out.println(44);

		System.out.println();

		/* printf-Methoden */
		// Aufbau einer Formatierungsregel:
		
		// %[flags][width][.precision]conversion-character

		// String-Formatierung (conversion-character s)
		String text = "Hallo";
		String name = "Hans";
		System.out.printf("%s %s%n", text, name);
		System.out.printf("%s %S%n", text, name); // Großbuchstabenconvertierung
		System.out.printf("%20s %s%n", text, name); // Festlegung der Ausgabelänge
		System.out.printf("%-20s %s%n", text, name); // linksbündig Ausgabe

		System.out.println();

		// Dezimalzahlen-Formatierungen (conversion-character d)
		System.out.println(1_000_000_000);
		System.out.printf("%,d%n", 1_000_000_000); // Komma --> Festlegung Tausendertrennzeichen
		System.out.printf(Locale.GERMANY, "%,d%n", 1_000_000_000);

		// Gleitkommazahlen-Formatierungen (conversion-character f)
		System.out.printf(Locale.GERMANY, "%.2f", 3.9471923);
		System.out.println();
		System.out.printf("%.2f", 3.9471923);
		System.out.println();

		// Tabelle
		System.out.printf("%-10s %s%n", "Name", "Note");
		System.out.println("--------------");
		System.out.printf("%-10s %.1f%n", "Hans", 1.5);
		System.out.printf("%-10s %.1f%n", "Peter", 5.5);
		System.out.printf("%-10s %.1f%n", "Jan", 3.5);
		System.out.printf("%-10s %.1f%n", "Don", 2.6);
		System.out.printf("%-10s %.1f%n", "Esel", 2.7);
		System.out.printf("%-10s %.1f%n", "Hans", 1.0);
		System.out.printf("%-10s %.1f%n", "Hans", 3.2);
		
		System.out.println();

		System.out.printf("| %-7s | %-10s | %-6s |%n", "ID", "Name", "Punkte");
		System.out.println("| ------- | ---------- | ------ |");
		System.out.printf("| %-7s | %-10s | %-6.1f |%n", "8172645", "Hans", 95.341);
		System.out.printf("| %-7s | %-10s | %-6.1f |%n", "1203653", "Peter", 40.716);
		System.out.printf("| %-7s | %-10s | %-6.1f |%n", "2912834", "Lisa", 28.827);
		System.out.printf("| %-7s | %-10s | %-6.1f |%n", "3982716", "Heidi", 88.359);

	}

}
