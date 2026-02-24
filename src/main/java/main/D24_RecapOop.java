package main;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Animal;
import model.Zoo;

public class D24_RecapOop {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		
		zoo.initializeAnimal();
		zoo.addAnimal(animal1);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		
		animal1.setType("Zebra");
		animal1.setBirthdate(LocalDate.now());
		animal1.setWeightInKg(100);
		animal1.setColor("Schwarz-Weiß-gestreift");
		animal1.setCarnivore(false);
		
		animal2.setType("Tieger");
		animal2.setBirthdate(LocalDate.of(2020, 8, 16));
		animal2.setWeightInKg(250);
		animal2.setColor("Orange-Schwarz-gestreift");
		animal2.setCarnivore(true);
		
		animal3.setType("Schimpanse");
		animal3.setBirthdate(LocalDate.of(2018, 12, 3));
		animal3.setWeightInKg(40);
		animal3.setColor("Braun");
		animal3.setCarnivore(true);
		
		animal3.eat();
		animal2.move();
		animal2.move();
		
		
		ArrayList<Animal> animals = zoo.getAnimals();
		
		for (int i = 0; i < animals.size(); i++) {
			Animal animal = animals.get(i);
			System.out.println(animal.getType() + ", " + animal.getWeightinKg());
		}
		

		System.out.println(animal3.getWeightinKg());

		
	}

}
