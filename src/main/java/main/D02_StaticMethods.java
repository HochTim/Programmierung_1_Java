package main;

import utility.Calculator;
import utility.Printer;

public class D02_StaticMethods {

	public static void main(String[] args) {
		Printer.printHelloWorld();
		Printer.printHelloWorld();
		Printer.printHelloWorld();
		Printer.printHelloWorld();
		Printer.printHelloWorld();
		
		Printer.printText("Hallo");
		Printer.printText("Tim");
		Printer.printText(",");
		Printer.printText("wie gehts");
		
		int result = Calculator.addition(5, 3);
		System.out.println(result);


	}

}
