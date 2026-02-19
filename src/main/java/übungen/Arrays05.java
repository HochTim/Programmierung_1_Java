package übungen;

import java.util.Scanner;

public class Arrays05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int menuItem, counter = 0, currentTask;
		;

		String[] tasks = new String[100];

		System.out.println("Optionen");
		System.out.println("1: Aufgabe hinzufügen");
		System.out.println("2: Aufgabe löschen");
		System.out.println("3: Aufgabe ausgeben");
		System.out.println("4: Beenden");

		while (true) {

			System.out.print("Was möchtest Du tun?: ");
			menuItem = scanner.nextInt();
			scanner.nextLine();
			 
			if (menuItem == 4) {
				break;
			}

			switch (menuItem) {
			case 1:
				System.out.println("Gib bitte die Aufgabenbeschreibung ein: ");
				tasks[counter] = scanner.nextLine();
				counter++;
				break;
			case 2:
				System.out.println("Gib bitte ein welche Aufgabe Gelöscht werden soll: ");
				currentTask = scanner.nextInt();
				tasks[currentTask] = "";
				break;
			case 3:
				System.out.println("Aufgaben: ");
				for (int i = 0; i < tasks.length; i++) {
					System.out.println(i + ":  " + tasks[i]);
				}
				break;
			}
			

		}

	}

}
