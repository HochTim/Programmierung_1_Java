package main;

public class Testdice {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 9;
		
		int diff=0;
		if (a < b) {
			 diff = b-a;
		} else if(a>b) {
			 diff = a-b;
		}
		
		System.out.println(diff);

	}

}
