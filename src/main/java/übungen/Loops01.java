package übungen;

public class Loops01 {
	
	public static void main(String[] args) {
		
		int solution;
		
		for (int i = 1; i <= 10; i++ ) {
		
			for (int j = 1; j <= 10; j++) {
				solution = i * j;
				System.out.println( i + " * " + j + " = " + solution);
			}
		}
		
	}

}
