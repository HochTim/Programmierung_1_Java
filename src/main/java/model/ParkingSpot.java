package model;

public class ParkingSpot {
	
	private  Vehicle vehicle;
	private final double lengthInM;
	private final double heightInM;
	private final boolean isForBusesOnly;
	
	public ParkingSpot( double lengthInM, double heigthInM, boolean isForBusesOnly) {
		this.heightInM = heigthInM;
		this.lengthInM = lengthInM;
		this.isForBusesOnly = isForBusesOnly;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public double getLengthInM() {
		return lengthInM;
	}
	public double getHeightInM() {
		return heightInM;
	}
	public boolean isForBusesOnly() {
		return isForBusesOnly;
	}
	@Override
	public String toString() {
		return "[ Vehicle"+vehicle+"...";
	}
	

}
