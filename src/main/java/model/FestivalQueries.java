package model;

import java.awt.List;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FestivalQueries {
	
	Map<Performance, Stage> schedule = new HashMap<Performance, Stage>();
	
	public java.util.List<String> getAllBandNamesSorted(){
		
		return  schedule.keySet().stream().map(Performance::bandName).sorted((n1, n2) -> n1.compareTo(n2)).toList();
		
	}
	
	public java.util.List<Stage> getAllStagesSortedByName(){
		return schedule.values().stream().distinct().sorted((n1, n2) -> n2.name().compareTo(n1.name())).toList();
//		return schedule.values().stream().distinct().sorted((n1, n2) -> n2.name().compareTo().toList().reversed();
	}
	
	public Map<LocalTime, java.util.List<Performance>> getPerformancesByStartTime(){
		return schedule.keySet().stream().collect(Collectors.groupingBy(k -> k.startTime()));
	}
	
	public long numberOfStagesBySize(StageSize size) {
		return schedule.values().stream().filter(v -> v.size() == size).count();
	}
	
	public Map<MusicGenre, java.util.List<String>> getBandNamesByGenreAsList(){
		return schedule.keySet().stream().collect(Collectors.groupingBy(k -> k.genre(), Collectors.mapping(b -> b.bandName(), Collectors.toList())));
	}
	
	public Map<MusicGenre, String> getBandNamesByGenreAsString(){
		return schedule.keySet().stream().collect(Collectors.groupingBy(k -> k.genre(), Collectors.mapping(b -> b.bandName(), Collectors.joining(", "))));
	}
	
	public Map<MusicGenre, Long> getNumberOfBandNamesByGenre(){
		return schedule.keySet().stream().collect(Collectors.groupingBy(k -> k.genre(), Collectors.mapping(b -> b.bandName(), Collectors.counting())));
	}
	
	public Map<MusicGenre, java.util.List<String>> getBandNamesByGenre2(){
		return schedule.keySet().stream().collect(Collectors.groupingBy(t -> t.genre(), Collectors.mapping(d -> d.bandName(), Collectors.toList())));
		
	}
	
	public Map<MusicGenre, Long> getNumberOfPerformancesPerGenre(){
		return schedule.keySet().stream().collect(Collectors.groupingBy(f -> f.genre(), Collectors.counting()));
	}
	
	public String getStageNamesBySizeAsString(StageSize size) {
		return schedule.values().stream().filter(f -> f.size().equals(size)).map(Stage::name).collect(Collectors.joining(","));
	}
	
	public Map<Boolean, java.util.List<Performance>> partitioningByTime(LocalTime time){
		return schedule.keySet().stream().collect(Collectors.partitioningBy(f -> f.startTime().isBefore(time)));
	}
	
	public Optional<MusicGenre> getMostFrequentGenre(){
		return schedule.keySet().stream().collect(Collectors.groupingBy(f -> f.genre(), Collectors.counting())).entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).map(e -> e.getKey());
	}
	
	public java.util.List<Performance> test() {
		return schedule.keySet().stream().skip(2).limit(4).toList();
	}
	
	public Map<MusicGenre, java.util.List<String>> getBandNamesByGenre4(){
		return schedule.keySet().stream().collect(Collectors.groupingBy(f -> f.genre(), Collectors.mapping(f -> f.bandName(), Collectors.toList())));
	}

}
