package übungen;

import model.ObjectOrientation1_Vehicles;

public class ObjectOrienting01_Vehicles {
	
	public static void main(String[] args){
		System.out.println(ObjectOrientation1_Vehicles.getNumberOfVehicles());
		ObjectOrientation1_Vehicles vehicle = new ObjectOrientation1_Vehicles("Koenigsegg","Jesko");
		
		vehicle.accelerate(100);
		vehicle.accelerate(286);
		vehicle.brake(183);
		vehicle.accelerate(236);
		
		double speed = vehicle.getSpeedInKmh();
		
		System.out.println(speed);
		System.out.println(vehicle);
		System.out.println(ObjectOrientation1_Vehicles.getNumberOfVehicles());

	}

}
