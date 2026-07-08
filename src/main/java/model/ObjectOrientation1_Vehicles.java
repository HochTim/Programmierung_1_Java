package model;

public class ObjectOrientation1_Vehicles {
		
		private final String make, model;
		
		private double speedInKmh;
		
		private static int numberOfVehicles = 0;
		
		public ObjectOrientation1_Vehicles(String make, String model) {
			this.make = make;
			this.model = model;
			numberOfVehicles++;
		}
		
		public String getMake(){
			return make;
		}
		
		public String getModel(){
			return model;
		}
		
		public double getSpeedInKmh(){
			return speedInKmh;
		}
		
		public void accelerate(int valueInKmh){
			speedInKmh += valueInKmh;
			System.out.println("Beschleunigen auf: " + speedInKmh+"Kmh");
		}
		
		public void brake(int valueInKmh){
		speedInKmh -= valueInKmh;
		System.out.println("Bremsen auf: " + speedInKmh +"Kmh");
		}
		
		@Override
		public String toString(){
		return "Vehicle: Hersteller=" + make +" Model="+ model;
		}
		
		public static int getNumberOfVehicles() {
			return numberOfVehicles;
		}
		
		
		

	}

