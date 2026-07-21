package model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Festival {

	private String name;
	private Map<Performance, Stage> schedule = new HashMap<>();

	public void addPerformance(Performance performance, Stage stage) throws DublicatePerformanceException {
		if (schedule.containsKey(stage)) {
			throw new DublicatePerformanceException();
		} else {
			schedule.put(performance, stage);
		}
	}

	public Optional<Stage> getStageByBandName(String bandName) {

		Optional<Stage> returnStage = Optional.empty();
		
		for( Entry<Performance, Stage> e : schedule.entrySet()) {
			
			if(e.getKey().genre().equals(bandName)) {
				returnStage = Optional.of(e.getValue());
				
				break;
			}
			
		}

		return returnStage;

	}

	public List<Performance> getPerformancesByGenre(MusicGenre genre) {
		List<Performance> performances = new ArrayList<>();
		
		schedule.forEach((k,v) -> {
			if(k.genre().equals(genre)) {
			performances.add(k); }
		
		});

//		for (Performance entry : schedule.keySet()) {
//			
//			MusicGenre p1 = entry.genre();
//			
//			if(p1.equals(genre)) {
//				performances.add(entry);
//			}
//
//		}
		Collections.sort(performances);
		return performances;
		
	}

}
