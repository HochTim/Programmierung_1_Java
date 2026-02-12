package übungen;

import java.util.Arrays;

public class Arrays07 {

	public static void main(String[] args) {
		int[] arrayOne = { 1, 2, 3, 4 };
		int[] arrayTwo = { 7, 3, 7, 2 };

		int lengthOfNewArray = arrayOne.length + arrayTwo.length;

		int[] newArray = new int[lengthOfNewArray];

		for (int i = 0; i < newArray.length; i++) {
			if (i < arrayOne.length) {
				newArray[i] = arrayOne[i];
			} else {
				newArray[i] = arrayTwo[i - arrayTwo.length];
			}
			System.out.println(newArray[i]);
		}
		
		System.out.println(Arrays.toString(newArray));

	}

}
 