package model;

import java.util.Comparator;

public class MovieByRaitingDescendingComperator implements Comparator<Movie>{

	@Override
	public int compare(Movie movie1, Movie movie2) {
		
	      return Double.compare(movie2.getRaiting(), movie1.getRaiting());
		
//		Double rating1 = movie1.getRaiting();
//		Double raiting2 = movie2.getRaiting();
//		
//		return raiting2.compareTo(rating1);
//		
//		return Double.valueOf(movie2.getRaiting()).compareTo(movie1.getRaiting());
	}

}
