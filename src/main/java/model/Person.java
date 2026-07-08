package model;

import java.time.LocalDate;
import java.util.Objects;

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
		return "Person [names=" + name + " gender=" + gender + " birthdate=" + birthdate;
	}

	@Override
	public boolean equals(Object obj) {
		Person otherPerson = (Person) obj;
		return this.name.equals(otherPerson.name) && gender == otherPerson.gender
				&& birthdate.equals(otherPerson.birthdate);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,gender,birthdate);
	}

}
