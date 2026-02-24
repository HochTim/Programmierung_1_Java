package main;

import model.TableLight;

public class D27_StaticElements {

	public static void main(String[] args) {
		
		int numberOfTableLights = TableLight.getNumberOfTableLights();
		System.out.println(numberOfTableLights);
		
		TableLight light1 = new TableLight();
		light1.switchOn();
		TableLight light2 = new TableLight();
		light2.plugIn();
		TableLight light3 = new TableLight();
		light3.plugIn();
		
	    numberOfTableLights = TableLight.getNumberOfTableLights();
		System.out.println(numberOfTableLights);

	}

}
