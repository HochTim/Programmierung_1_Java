package model;

import java.time.LocalTime;

public record Performance(String bandName, LocalTime startTime, MusicGenre genre) implements Comparable<Performance>{

	@Override
	public int compareTo(Performance otherMusic) {
		return startTime.compareTo(otherMusic.startTime());
		
	}
	

}
