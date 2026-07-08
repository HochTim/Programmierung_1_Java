package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.Color;
import model.LandAnimal;
import model.WaterAnimal;
import model.Zoo;

public class D24_RecapOop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Zoo zoo = new Zoo("Ravensburger Tierpark");
		
		Zoo zoo1 = new Zoo(scanner.next());
		
		System.out.println(zoo1);

		Animal animal1 = new LandAnimal("Zebra", Color.WHITE_BLACK_STRIPED, false, LocalDate.now(), 100,4); //Upcast
		Animal animal2 = new LandAnimal("Tieger",Color.ORANGE, true, LocalDate.of(2020, 8, 16), 250,4); //Upcast
		Animal animal3 = new WaterAnimal("Clown-Fisch", Color.ORANGE, false, LocalDate.of(2018, 12, 3), 40,true);//Upcast

		zoo.addAnimal(animal1);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);

		animal3.eat(); //Dynamische Polymorphie
		animal2.move();//Dynamische Polymorphie
		animal2.move();//Dynamische Polymorphie
		animal3.move();//Dynamische Polymorphie

		ArrayList<Animal> animals = zoo.getAnimals();

		for (Animal animal : animals) {
			System.out.println(animal);//Dynamische Polymorphie
		}
		
		System.out.println(zoo);
		
		System.out.println();
		
		ArrayList<WaterAnimal> wateranimals = zoo.getWaterAnimals();
		System.out.println(wateranimals);

	}

}
