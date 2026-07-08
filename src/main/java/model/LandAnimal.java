package model;

import java.time.LocalDate;

public final class LandAnimal extends Animal{
	
	private final int numberOfLegs;
	
	public LandAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate, double weightInKg,int numberOfLegs) {
		super(type,color,isCarnivore,birthdate,weightInKg);
		this.numberOfLegs = numberOfLegs;
	}
	
	@Override
	public void eat() {
		weightInKg *= 1.15;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	public void run() {
		System.out.println("renn, renn");
	}
	
	public void move() {
		super.move();
		run();
	}
	
	public String toString() {
				return "Animal [type=" + getType()+", color=" + getColor() + ", weightInKg=" + getWeightinKg() + ", isCarnivore=" + isCarnivore() + ", birthdate=" + getBirthdate() +", NumberOfLegs"+numberOfLegs+ " ]";
			}
	}


