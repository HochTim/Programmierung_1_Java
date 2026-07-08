package main;

import java.util.ArrayList;

public class D28_ForEachLoop {

	   public static void main(String[] args) {
	      ArrayList<String> names = new ArrayList<>();

	      names.add("Hans");
	      names.add("Peter");
	      names.add("Lisa");
	      names.add("Anna");

	      /* classic for loop */
	      for (int i = 0; i < names.size(); i++) {
	         String name = names.get(i);
	         System.out.println(name);
	      }

	      System.out.println();

	      /* for-each loop */
	      for (String name : names) {
	         System.out.println(name);
	      }
	   }

	}
