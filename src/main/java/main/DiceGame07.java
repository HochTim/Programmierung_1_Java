package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Dice;

public class DiceGame07 {
	
	private static List<Dice> dices;
	private static Scanner scanner;
	private static int rounds;
	private static int points;

	public static void main(String[] args) {
		
		dices = new ArrayList<>();
		scanner = new Scanner(System.in);
		rounds = 0;
		points = 0;
		int total = 0;
		
		for (int i = 0; i<5;i++) {
			dices.add(new Dice());
		}
		
		while(true) {
			rounds++;
			
			for (Dice d: dices) {
				total += d.rollTheDice();
			}
			
			System.out.println("Wurf Größer 17?");
			boolean tip = scanner.nextBoolean();
			
			if (tip && total>17) {
				points++;
				System.out.println("Richtig, der Wurf betrug: "+total);
				
			} else {
				System.out.println("Falsch, der Wurf betrug: "+total);
			}
			System.out.println("Nochmal?");
			if(!scanner.nextBoolean()) {
				System.out.println();
				System.out.println("Runden: "+rounds+"Punkte: "+ points);
				break;
			}
			System.out.println();
		}

	}

}
