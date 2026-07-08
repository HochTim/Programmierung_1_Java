package model;

import java.time.LocalDate;

public final class WaterAnimal extends Animal {

	private final boolean isSaltwater;

	public WaterAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate, double weightInKg,
			boolean isSaltwater) {

		super(type, color, isCarnivore, birthdate, weightInKg);
		this.isSaltwater = isSaltwater;
	}
	@Override
	public void eat() {
		weightInKg *= 1.35;
	}
	
	public boolean isSaltwater() {
		return isSaltwater;
	}
	
	public void swim() {
		System.out.println("schwimm, schwimm");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
	
	@Override
	public String toString() {
			return "Animal [type=" + getType()+", color=" + getColor() + ", weightInKg=" + getWeightinKg() + ", isCarnivore=" + isCarnivore() + ", birthdate=" + getBirthdate() +", isSaltwater"+isSaltwater+ " ]";
		}
	}


