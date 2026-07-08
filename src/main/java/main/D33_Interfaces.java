package main;

import java.util.ArrayList;
import java.util.List;

import model.AlredyPluggedInException;
import model.FlashLight;
import model.TableLight;
import model.Toaster;
import model.Wired_Devices;

public class D33_Interfaces {

	public static void main(String[] args) throws AlredyPluggedInException {
		
		TableLight 
		tableLight1 = new TableLight();
		TableLight tableLight2 = new TableLight();
		FlashLight flashLight1 = new FlashLight();
		Toaster toaster1 = new Toaster();
		Toaster toaster2 = new Toaster();
		
		List<Wired_Devices> wiredDevices = new ArrayList<>();
		
		wiredDevices.add(toaster2); //Upcast
		wiredDevices.add(toaster1);//Upcast
		wiredDevices.add(tableLight1);//Upcast
		wiredDevices.add(tableLight2);//Upcast
//		wiredDevices.add(flashLight1);
		
		for (Wired_Devices wiredDevice : wiredDevices) {
			wiredDevice.plugIn(); //Dynamische Polymorphie
			if (wiredDevice instanceof TableLight tableLight) {
				tableLight.switchOn();
				//TableLight tableLight = (TableLight) wiredDevice; Downcast
				System.out.println(tableLight);
			}
		}

	}

}
