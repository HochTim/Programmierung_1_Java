package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public record Festival1(String name, Map<Performance, Stage> schedule) {

	public void addPerformance(Performance performance, Stage stage) throws DublicatePerformanceException {
		if (schedule.containsKey(performance)) {
			throw new DublicatePerformanceException();
		} else {
			schedule.put(performance, stage);
		}

	}

	public Optional<Stage> getStageByBandName(String bandName) {
		/* Option Imperativ */
//		Optional<Stage> rStage = Optional.empty();
//
//		for (Entry<Performance, Stage> entry : schedule.entrySet()) {
//			if (entry.getKey().bandName().equals(bandName)) {
//				rStage = Optional.of(entry.getValue());
//				break;
//			}
//
//		}
//		return rStage;

		/* Option Deklarativ */

		return schedule.entrySet().stream()
				.filter(entry -> entry.getKey().bandName().equals(bandName))
				.map(entry -> entry.getValue()) //.map(Entry::getValue)
				.findAny();

	}

	public List<Performance> getPerformanceByGenre(MusicGenre genre) {
		
		/* Imperative Lösung */
//		List<Performance> performances = new ArrayList<>();
//
//		for (Performance key : schedule.keySet()) {
//
//			if (key.genre() == genre) {
//				performances.add(key);
//			}
//
//		}
//		Collections.sort(performances);
//		return performances;
		
		/* Deklarative Lösung */
		
		return schedule.keySet().stream()
					   .filter(key -> key.genre().equals(genre))
					   .sorted()
					   .toList();

	}

}
