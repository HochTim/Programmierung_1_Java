package übungen;

import model.Dice;

public class OO03 {

	public static void main(String[] args) {
		
		Dice dice = new Dice();
		
		System.out.println("ID - Würfelwert");
		
		for (int i = 0; i < 5; i++) {
			dice.rollTheDice();
			int tempVal = dice.getValue();
			System.out.println(dice + " - " + tempVal);
		}

	}

}
