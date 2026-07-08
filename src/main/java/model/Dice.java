package model;

import java.util.Random;

public class Dice {
	
//	private final int id;
	private int value;
	
//	public DiceOO03(int id) {
////		this.id = id;
//		rollTheDice();
//	}
	
//	public int getId() {
//		return id;
//	}
	
	public int getValue() {
		return value;
	}
	
	public int rollTheDice() {
		Random random = new Random();
		value = random.nextInt(1,7);
		return value;
	}

}
