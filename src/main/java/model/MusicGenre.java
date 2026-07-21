package model;

import lombok.AllArgsConstructor;
import lombok.Data;

public enum MusicGenre {
	
	ROCK("Rock"),POP("Pop"),JAZZ("Jazz"),METAL("Metal"),ELECTRONIC("Electronik");
	
	private final String description; 
	
	 MusicGenre (String description) {
		this.description = description;
	}
	
	  public String getDexcription() {
	      return description;
	   }

}
