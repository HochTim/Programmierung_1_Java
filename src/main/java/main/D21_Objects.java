package main;

import java.time.chrono.IsoChronology;

import model.LightBulb;
import model.TableLight;

public class D21_Objects {
	
	public static void main(String[] args) {
		
		int i = 0;
		TableLight light1 = null;
		
		i = 5;
		light1 = new TableLight();
//		LightBulb redlLightBulb = new LightBulb(); Version2
//		redlLightBulb.color = "rot"; Version1
//		light1.changeLightBulp(redlLightBulb); Version2
		
		int x = i;
		TableLight light2 = light1;
		
		i = 7;
		light2.plugIn();
		light1.switchOn();
		
		System.out.println("i: "  + i);
		System.out.println("i: "  + x);
		System.out.println("light1: " + light1);
		System.out.println("light2: " + light2);
		System.out.println("light1: " + light1.isShining());
		System.out.println("light2: " + light2.isShining());
		
		
	}

}
