package übungen;

public class Arrays01 {

	public static void main(String[] args) {

		int[] array = new int[15];
		int number = 1;

		for (int i = 0; i < array.length; i++) {
			
			array[i] = number;
			
			number = number * 2;
		}
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}


	}

}
