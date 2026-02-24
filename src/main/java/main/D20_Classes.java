package main;

import model.LightBulb;
import model.TableLight;

public class D20_Classes {

	public static void main(String[] args) {

//		LightBulb redLightBulp = new LightBulb(); Version 2
//		redLightBulp.color = "rot"; Version1

//		LightBulb blueLightBulp = new LightBulb(); Version 2
//		blueLightBulp.color = "blau"; Version1

		TableLight tableLight = new TableLight();
		System.out.println(tableLight.isShining());
		tableLight.plugIn();
		System.out.println(tableLight.isShining());
		tableLight.switchOn();
		System.out.println(tableLight.isShining());
//		tableLight.changeLightBulp(blueLightBulp); Version 2
//		System.out.println(tableLight.lightBulp.color); Version1
		System.out.println(tableLight.isShining());

//		LightBulb oldLightBulp = tableLight.changeLightBulp(redLightBulp); Version 2
//		System.out.println(oldLightBulp.color); Version1
//		System.out.println(tableLight.lightBulp.color); Version1

		System.out.println(tableLight);

	}

}
