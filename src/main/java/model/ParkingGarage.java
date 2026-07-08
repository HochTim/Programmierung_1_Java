package model;

public class ParkingGarage {

	private final ParkingSpot[] parkingSpots;
	int numberOfSpots;

	public ParkingGarage(ParkingSpot[] numberOfSpots) {
		parkingSpots = numberOfSpots;
	}

	public String parkIn(Car car, int parkingSpotNumber) {
		if (parkingSpots[parkingSpotNumber].getVehicle() != null) {
			return "Dieser Parkplatz ist bereits Besetzt";
		} else if (parkingSpots[parkingSpotNumber].isForBusesOnly() == true) {
			return "Dieser Parkplatz ist nur für Busse";
		} else if (parkingSpots[parkingSpotNumber].getHeightInM() < car.getHeightInM()
				|| parkingSpots[parkingSpotNumber].getLengthInM() < car.getLengthInM()) {
			return "Das Auto ist zu Groß";
		} else {
			parkingSpots[parkingSpotNumber].setVehicle(car);
			return "Das Auto wurde Eingeparkt";
		}
	}

	public String parkOut(Car car) {
		for (int i = 0; i < parkingSpots.length; i++) {
			ParkingSpot tmpSpot = parkingSpots[i];
			Vehicle tmpVehicle = tmpSpot.getVehicle();
			if (tmpVehicle == car) {
				parkingSpots[i].setVehicle(null);;
				return "Auto erfolgreich Ausgeparkt";

			}
			
		}
		return "Auto nicht gefunden";
	}
	
	public int getNextFreeParkingSpotNumber() {
		for (int i = 0; i<parkingSpots.length;i++) {
			if (parkingSpots[i].getVehicle() == null) {
				return i;
			}
		}
		return -1;
	}

}
