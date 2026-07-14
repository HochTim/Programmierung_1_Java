package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie implements Comparable<Movie>{
	
	private final String title;
	private final String publishingYear;
	private double raiting;
	
	@Override
	public int compareTo(Movie otherMovie) {
//		String myTitle = title;
//		String otherTitle = otherMovie.getTitle();
//		
//		return myTitle.compareTo(otherTitle);
		
		return title.compareTo(otherMovie.getTitle());
		
		
	}
	
	public void incrementRating() {
		raiting += 0.1;
	}

}
