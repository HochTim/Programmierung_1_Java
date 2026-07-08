package model;

public class Vehicle {
	
	private final String make;
	private final String modell;
	private final double lengthInM;
	private final double heightInM;
	
	public Vehicle(String make, String modell, double lengthInM, double heightInM) {
		this.make = make;
		this.modell = modell;
		this.lengthInM = lengthInM;
		this.heightInM = heightInM;
	}
	
	public String getMake() {
		return make;
	}
	public String getModell() {
		return modell;
	}
	public double getLengthInM() {
		return lengthInM;
	}
	public double getHeightInM() {
		return heightInM;
	}

}
