package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import model.Movie;
import model.MovieByRaitingDescendingComperator;

public class D37_InnerClasses {

	public static void main(String[] args) {

		/* Movies */
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("John Wick 4", "2023", 7.6));
		movies.add(new Movie("Disaster Movie", "2008", 1.9));
		movies.add(new Movie("Der Pate", "1972", 9.2));

		System.out.println(movies);

		/* Local Class */
		class MovieByYearAscendingComperator implements Comparator<Movie> {

			@Override
			public int compare(Movie o1, Movie o2) {

				return o1.getPublishingYear().compareTo(o2.getPublishingYear());
			}

		}

		Collections.sort(movies, new MovieByYearAscendingComperator());
		System.out.println(movies);
		System.out.println();

		/* Anonyme Klassen */

		Collections.sort(movies, new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		System.out.println(movies);
		System.out.println();

		/* Lambda Expression */

		Collections.sort(movies, (o1, o2) -> Double.compare(o1.getRaiting(), o2.getRaiting()));
		System.out.println(movies);

		/* for each */
		for (Movie m : movies) {
			System.out.println(m);
		}
		System.out.println();

		/* Local Class */
		class PrintMovieConsumer implements Consumer<Movie> {

			@Override
			public void accept(Movie m) {
				System.out.println(m);

			}

		}

		movies.forEach(new PrintMovieConsumer());
		System.out.println();

		/* Anonymous Class */

		movies.forEach(new Consumer<Movie>() {
			@Override
			public void accept(Movie m) {
				System.out.println(m);
			}
		});
		System.out.println();

		/* Lambda Expressions */

		movies.forEach(m -> System.out.println(m));
		System.out.println();
		
		/* Method Reference */
		movies.forEach(System.out::println);
		
		movies.forEach(m -> m.incrementRating());
		movies.forEach(Movie::incrementRating);

	}
	


}
