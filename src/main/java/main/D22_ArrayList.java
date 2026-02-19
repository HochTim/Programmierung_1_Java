package main;

import java.util.ArrayList;

public class D22_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		/* Elemente Anfügen */
		names.add("Hans");
		names.add("Peter");

		/* Elemente Einfügen */
		names.add(1, "Lisa");
		names.add(1, "Max");
		names.add(2, "Anna");

		/* Elemente ausgeben */
		System.out.println(names);

		/* Elemente Löschen */
		names.remove(0);
		names.remove("Anna");

		/* Elemente auslesen */
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(i);
		}

		/* Elemente ausgeben */
		System.out.println(names);

	}

}
