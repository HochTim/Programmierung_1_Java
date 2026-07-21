package model;

public enum StageSize {

	SMALL("klein"), MEDIUM("Mittel"), LARGE("Groß");

	private final String description;

	StageSize(String description) {
		this.description = description;
	}

	public String getDexcription() {
		return description;
	}

}
