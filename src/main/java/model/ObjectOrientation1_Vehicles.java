package model;

public class ObjectOrientation1_Vehicles {
		
		private String make, model;
		
		private String makeModel = make + model;
		
		private double speedInKmh;
		
		public void setMake(String make){
			this.make = make;
		}
		
		public void setModel(String  model){
			this.model = model;
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
		
		public String toString(){
		return makeModel;
		}
		
		
		

	}

