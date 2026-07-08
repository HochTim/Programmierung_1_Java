package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Dice;

public class DiceGame5 {
	
	private static List<Dice> dices1;
	private static List<Dice> dices2;
	private static int points1;
	private static int points2;
	private static String name1;
	private static String name2;

	public static void main(String[] args) {
		dices1 = new ArrayList<>();
		dices2 = new ArrayList<>();
		int n1 = 0;
		int n2 = 0;
		points1 = 0;
		points2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name1");
		name1 = scanner.next();
		System.out.println("Name2");
		name2 = scanner.next();
		
		for (int i = 0; i<3;i++) {
			dices1.add(new Dice());
			dices2.add(new Dice());
		}
		
		for (int i = 1;i<=5;i++) {
			n1 = 0;
			n2 = 0;
			
			for (Dice d: dices1) {
				n1+=d.rollTheDice();
			}
			for (Dice d: dices2) {
				n2+=d.rollTheDice();
			}
			if (n1>n2) {
				points1++;
			} else if(n2>n1) {
				points2++;
			}
		}
		System.out.println(points1);
		System.out.println(points2);

	}

}
