package übungen;

public class PrintFÜbung {

	public static void main(String[] args) {
		

		String name = "Spongebob";
		int age = 33;
		double salery = 7489.349987655667;
		double salery2 = -789.349987655667;
		char gender = 'm';
		
		System.out.printf("Mitarbeiter %s ist %d Jahre alt und Verdient %,.2f. \n Er ist von Geschlecht %c \n",name,age,salery2,gender);
		System.out.printf("Mitarbeiter %s ist %d Jahre alt und Verdient %+.2f. \n Er ist von Geschlecht %c \n",name,age,salery,gender);
		System.out.printf("Mitarbeiter %s ist %d Jahre alt und Verdient %(.2f. \n Er ist von Geschlecht %c \n",name,age,salery2,gender);
		System.out.printf("Mitarbeiter %s ist %d Jahre alt und Verdient % .2f. \n Er ist von Geschlecht %c \n",name,age,salery,gender);
		System.out.println();
		System.out.printf("%-4f %d \n",salery,age);
		System.out.printf("%04f %d\n",salery2,age);
		System.out.printf("%f %d\n",salery,age);

	}

}
