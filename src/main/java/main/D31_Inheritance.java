package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.AlredyPluggedInException;
import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.TableLight;

public class D31_Inheritance {

	public static void main(String[] args) throws AlredyPluggedInException {
		/* Objekterzeugungen */
		Scanner scanner = new Scanner(System.in);
		TableLight tableLight1 = new TableLight();
		LightBulb redLightBulb = new LightBulb(scanner.next());
		System.out.println(redLightBulb);
		TableLight tableLight2 = new TableLight(redLightBulb);
		
		FlashLight flashLight1 = new FlashLight();
		FlashLight flashLight2 = new FlashLight();
		
		/* Ohne Vererbung */
		ArrayList<TableLight> tableLights = new ArrayList<>();
		tableLights.add(tableLight1);
		tableLights.add(tableLight2);
		
		for(TableLight light : tableLights) {
			light.switchOn();
			System.out.println(light.isShining());
		}
		
		ArrayList<FlashLight> flashLights = new ArrayList<>();
		flashLights.add(flashLight1);
		flashLights.add(flashLight2);
		
		for(FlashLight flashLight : flashLights) {
			flashLight.switchOn();
			System.out.println(flashLight.isShining());
		}
		
		System.out.println();
		
		/* Ansatz mit Vererbung */
		ArrayList<Light> lights = new ArrayList<>();
		
		lights.add(tableLight1); //Upcast
		lights.add(tableLight2); //Upcast
		lights.add(flashLight1); //Upcast
		lights.add(flashLight2); //Upcast
		
		for (Light light : lights) {
			light.switchOn(); //Dynamische Polymorphy
			
//			if (light instanceof TableLight) {
//			TableLight tableLight = (TableLight)light; //DownCast
//			tableLight.plugIn();
//			}
			/* neue Variante*/
			if (light instanceof TableLight tableLight) { /*testen ob parent ein bestimmmtes child ist*/
				tableLight.plugIn();
			}
			System.out.println(light.isShining()); //Statische Polymorphie bei println + Dynamische Polymorphie bei isShining
			System.out.println(light.toString()); //Statische Polymorphie bei println + Dynamische Polymorphie bei isShining

		}

	}

}
