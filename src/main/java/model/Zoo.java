package model;

import java.util.ArrayList;

public class Zoo {

	private final String name;
	private final ArrayList<Animal> animals;

	public Zoo(String name) {
		this.name = name;
		animals = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public String toString() {
		return "Zoo [name=" + name + ", animals=" + animals + " ]";
	}

	public ArrayList<WaterAnimal> getWaterAnimals() {
		ArrayList<WaterAnimal> waterAnimals = new ArrayList<>();

		for (Animal tempAnimal : animals) {
			if (tempAnimal instanceof WaterAnimal) {
				waterAnimals.add((WaterAnimal) tempAnimal); // Downcast
			}
//			if (tempAnimal instanceof WaterAnimal w) {
//				waterAnimals.add(w);
//			}

		}

		return waterAnimals;
	}

}
