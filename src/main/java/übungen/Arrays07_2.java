package übungen;

public class Arrays07_2 {

	public static void main(String[] args) {

		int[] arrayOne = { 1, 2, 3, 4 };
		int[] arrayTwo = { 5, 6, 7, 8 };

		int[] arrayThree = new int[arrayOne.length + arrayTwo.length];

		for (int i = 0; i < arrayThree.length; i++) {

			if (i < arrayOne.length) {

				arrayThree[i] = arrayOne[i];
			} else {

				arrayThree[i] = arrayTwo[i - arrayOne.length];

			}

			System.out.print(arrayThree[i]);

		}

	}

}
