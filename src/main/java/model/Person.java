package model;

import java.time.LocalDate;

public class Person {
	
	private String name;
	private char gender;
	private final LocalDate birthdate;
	
	public Person(String name, char gender, LocalDate birthdate) {
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
	}
	
	@Override
	public String toString() {
		return "Person [names=" + name + " gender=" +gender +" birthdate="+birthdate;
	}

}
