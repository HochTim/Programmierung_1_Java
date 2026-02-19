package übungen;

public class Arrays04 {

	public static void main(String[] args) {
		int[] binary1 = { 1, 0, 0, 1, 0, 1, 1, 0 };
		int[] binary2 = { 0, 1, 1, 0, 0, 1, 0, 1 };
		int[] solution = new int[binary1.length + 1];

		int carry = 0;

		for (int i = binary1.length - 1; i >= 0; i--) {
			int sum = binary1[i] + binary2[i] + carry;
			solution[i + 1] = sum % 2;
			carry = sum / 2;
		}

		solution[0] = carry;

		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i]);
		}
	}
}
