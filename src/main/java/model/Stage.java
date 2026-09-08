package model;

public record Stage(String name, StageSize size) implements Comparable<Stage> {

	@Override
	public int compareTo(Stage o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
