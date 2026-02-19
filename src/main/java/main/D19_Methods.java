package main;

import java.util.Arrays;

import model.StringArray;
import utility.StringArrayHelper;

public class D19_Methods {

	public static void main(String[] args) {
		
		/* Prozedurale Lösung (Daten und Routinen Getrennt */
		
		String [] names = new String[2];
		
		StringArrayHelper.print(names);
		names = StringArrayHelper.add(names, "Hans");
		StringArrayHelper.print(names);
		names = StringArrayHelper.add(names, "Peter");
		StringArrayHelper.print(names);
		names = StringArrayHelper.add(names, "Lisa");
		StringArrayHelper.print(names);
		
		int size = StringArrayHelper.size(names);	
		System.out.println(size);
		
		System.out.println();
		
		/* Objectorientierte Lösung (Daten und Routinen Verbunden */
		StringArray names2 = new StringArray();
		
		names2.print();
		names2.add("Hans");
		names2.print();
		names2.add("Peter");
		names2.print();
		names2.add("Lisa");
		names2.print();
		System.out.println(names2.size());
		
		

	}

}
