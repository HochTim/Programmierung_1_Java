package model;

import java.time.LocalDate;

public abstract class Animal {

	private final String type;
	protected double weightInKg;
	private final Color color;
	private final boolean isCarnivore;
	private  final LocalDate birthdate;
	
	

	public Animal(String type, Color color, boolean isCarnivore, LocalDate birthdate, double weightInKg) {
		this.type = type;

		this.color = color;

		this.isCarnivore = isCarnivore;

		this.birthdate = birthdate;
		
		this.weightInKg = weightInKg;
	}

	public abstract void eat();

	public void move() {
		weightInKg *= 0.98;
	}



	public String getType() {
		return type;
	}

	public double getWeightinKg() {
		return weightInKg;
	}

	public Color getColor() {
		return color;
	}

	public boolean isCarnivore() {
		return isCarnivore;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type+", color=" + color + ", weightInKg=" + weightInKg + ", isCarnivore=" + isCarnivore + ", birthdate=" + birthdate + " ]";
	}

}
