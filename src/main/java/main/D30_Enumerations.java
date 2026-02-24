package main;

import java.time.LocalDate;

import model.PlugType;
import model.TableLight;
import model.Weekday;

public class D30_Enumerations {

	public static void main(String[] args) {
		
		PlugType typeF = PlugType.TYPE_F;
		PlugType typeI = PlugType.TYPE_I;
		
		TableLight light1 = new TableLight();
		
		System.out.println(typeF);
		System.out.println(typeI);
		System.out.println(light1);
		
		System.out.println(Weekday.TUESDAY);
		System.out.println(LocalDate.now().getMonthValue());
		System.out.println(PlugType.valueOf("TYPE_F"));

	}

}
