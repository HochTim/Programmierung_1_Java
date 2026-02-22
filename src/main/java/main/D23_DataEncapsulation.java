package main;

import model.LightBulb;
import model.TableLight;

public class D23_DataEncapsulation {

	public static void main(String[] args) {
		
		LightBulb redLightBulb = new LightBulb();
		redLightBulb.setColor("rot");
		
		TableLight light1 = new TableLight();
		light1.switchOn();
		light1.plugIn();
		light1.changeLightBulp(redLightBulb);
		
		System.out.println(light1.isShining());
		System.out.println(light1.getLightBulb().getColor());
		
		
		
		
		
//		light1.isOn = true; das Geht nicht da Der zugriff wegen private verhindert wird
//		light1.isConnected = true;
//		light1.lightBulp = redLightBulb;

	}

}