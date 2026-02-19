package model;

public class TableLight {

	private boolean isConnected;
	private boolean isOn;
	private LightBulb lightBulb;

	public void plugIn() {
		isConnected = true;
	}

	public void pullThePlug() {
		isConnected = false;
	}

	public void switchOn() {
		isOn = true;
	}

	public void switchOff() {
		isOn = false;
	}

	public LightBulb changeLightBulp(LightBulb newLightBulp) {
		LightBulb oldLightBulp = lightBulb;
		lightBulb = newLightBulp;
		
		return oldLightBulp;
	}

	public boolean isShining() {

		if (isConnected == true && isOn == true && lightBulb != null) { /* isConnected reicht aus == unnötig*/
			return true;
		} else {
			return false;
		}
// return isConnected && isOn && lightBulp != null;
	}
	
	public boolean isConnected() {
		return isConnected;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public LightBulb getLightBulb(){
		return lightBulb;
	}

}
