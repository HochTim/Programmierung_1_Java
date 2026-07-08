package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Movie;
import model.MovieByRaitingDescendingComperator;

public class D35_Comperators {

	  public static void main(String[] args) {
	      /* Numbers */
	      List<Integer> numbers = new ArrayList<>();
	      numbers.add(6);
	      numbers.add(-2);
	      numbers.add(-8);
	      numbers.add(529);
	      numbers.add(6);
	      numbers.add(0);

	      System.out.println(numbers);
	      Collections.sort(numbers);
	      System.out.println(numbers);

	      /* Names */
	      List<String> names = new ArrayList<>();
	      names.add("Anna");
	      names.add("anna");
	      names.add("Bert");
	      names.add("!x2");
	      names.add("Xaver");
	      names.add("Alf");

	      System.out.println(names);
	      Collections.sort(names);
	      System.out.println(names);

	      /* Movies */
	      List<Movie> movies = new ArrayList<>();
	      movies.add(new Movie("John Wick 4", "2023", 7.6));
	      movies.add(new Movie("Disaster Movie", "2008", 1.9));
	      movies.add(new Movie("Der Pate", "1972", 9.2));

	      System.out.println(movies);
	      Collections.sort(movies);
	      System.out.println(movies);
	      Collections.sort(movies, new MovieByRaitingDescendingComperator());
	      System.out.println(movies);
	   }

	}
