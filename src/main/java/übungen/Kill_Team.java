package übungen;

import java.util.Random;

public class Kill_Team {
	public static void main(String[] args) {
		String nameOfPlayer1, nameOfPlayer2;
		String nameOfFighter1, nameOfFighter2;
		int healthPointsOfFighter1, healthPointsOfFighter2;
		
		nameOfPlayer1 = "Hans";
		nameOfPlayer2 = "Peter";
		nameOfFighter1 = "Gregor";
		nameOfFighter2 = "Bonekraka";
		healthPointsOfFighter1 = 8;
		healthPointsOfFighter2 = 10;
		
		//Deklarierung Würfel
		Random dize = new Random();
		int randomNumber1Spieler1 = dize.nextInt(1, 7);
		int randomNumber2Spieler1 = dize.nextInt(1, 7);
		int randomNumber3Spieler1 = dize.nextInt(1, 7);
		int randomNumber4Spieler1 = dize.nextInt(1, 7);
		int randomNumber5Spieler1 = dize.nextInt(1, 7);
		
		int randomNumber1Spieler2 = dize.nextInt(1, 7);
		int randomNumber2Spieler2 = dize.nextInt(1, 7);
		int randomNumber3Spieler2 = dize.nextInt(1, 7);
		int randomNumber4Spieler2 = dize.nextInt(1, 7);
		int randomNumber5Spieler2 = dize.nextInt(1, 7);
		
		System.out.println("Spieler1, Name: " + nameOfPlayer1);
		System.out.println("Spieler1, Kämpfer 1, Name: " + nameOfFighter1);
		System.out.println("Spieler1, Kämpfer 1, LP: " + healthPointsOfFighter1);
		
		System.out.println();
		
		System.out.println("Spieler2, Name: " + nameOfPlayer2);
		System.out.println("Spieler2, Kämpfer 2, Name: " + nameOfFighter2);
		System.out.println("Spieler2, Kämpfer 2, LP: " + healthPointsOfFighter2);
		
		//Zug 1
		
		//Damage Fighter 1
		int damageOfFighter1 = randomNumber1Spieler1 + randomNumber2Spieler1 + randomNumber3Spieler1 + randomNumber4Spieler1;
		
		//Defense Fighter 2
		int defenseOfFighter2 = randomNumber1Spieler2 + randomNumber2Spieler2 + randomNumber3Spieler2;
		
		int unblockedDamage1 = damageOfFighter1 - defenseOfFighter2;
		
		healthPointsOfFighter2 -= unblockedDamage1;
		
		
		
		System.out.println("*-------*");
		System.out.println("Zug 1");
		System.out.println("*-------*");
		
		System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + "( " + healthPointsOfFighter1 + " Lp )");
		System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + "( " + healthPointsOfFighter2 + " Lp )");
		
		System.out.println();
		
		System.out.println(nameOfFighter1 + "Greift " + nameOfFighter2 + " an");
		System.out.println(nameOfFighter1 + "Würfelt: "+ randomNumber1Spieler1 +", "+ randomNumber2Spieler1 +", "+ randomNumber3Spieler1 + " und " + randomNumber4Spieler1);
		System.out.println(nameOfFighter1 + "erzielt " + damageOfFighter1 + " Treffer");
		System.out.println(nameOfFighter2 + "Würfelt: "+ randomNumber1Spieler2 +", "+ randomNumber2Spieler2 + " und "+ randomNumber3Spieler2);
		System.out.println(nameOfFighter2 + "erzielt " + defenseOfFighter2 + " Blocks");
		System.out.println(nameOfFighter2 + "erleidet " + unblockedDamage1 + " Schaden und hat noch" + healthPointsOfFighter2 + " LP");
	
		
		//Zug 2

		
		//Damage Fighter 1
		int damageOfFighter2 = randomNumber2Spieler2 + randomNumber3Spieler2 + randomNumber4Spieler2 + randomNumber5Spieler2;
		
		//Defense Fighter 2
		int defenseOfFighter1 = randomNumber3Spieler1 + randomNumber4Spieler1 + randomNumber5Spieler1;
		
		int unblockedDamage2 = damageOfFighter1 - defenseOfFighter2;
		
		healthPointsOfFighter1 -= unblockedDamage1;
		
		
		
		System.out.println("*-------*");
		System.out.println("Zug 2");
		System.out.println("*-------*");
		
		System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + "( " + healthPointsOfFighter2 + " Lp )");
		System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + "( " + healthPointsOfFighter1 + " Lp )");
		
		System.out.println();
		
		System.out.println(nameOfFighter2 + "Greift " + nameOfFighter1 + " an");
		System.out.println(nameOfFighter2 + "Würfelt: "+ randomNumber2Spieler2 +", "+ randomNumber3Spieler2 +", "+ randomNumber4Spieler2 +" und "+  randomNumber5Spieler2);
		System.out.println(nameOfFighter2 + "erzielt " + damageOfFighter1 + " Treffer");
		System.out.println(nameOfFighter1 + "Würfelt: "+ randomNumber3Spieler1 +", "+ randomNumber4Spieler1 +" und "+ randomNumber5Spieler1);
		System.out.println(nameOfFighter1 + "erzielt " + defenseOfFighter1 + " Blocks");
		System.out.println(nameOfFighter1 + "erleidet " + unblockedDamage2 + " Schaden und hat noch" + healthPointsOfFighter1 + " LP");

		
	}

}
