package model;

public class TableLight {

	private boolean isConnected;
	private boolean isOn;
	private LightBulb lightBulb;
	private final PlugType plugType;

	private static int numberOfTableLights;

	public TableLight() {
//		plugType = new PlugType("Typ F", "CEE 7/4", "Europa"); Version 1
		plugType = PlugType.TYPE_F;
		numberOfTableLights++;
	}

	public TableLight(LightBulb lightBulb) {
//		plugType = new PlugType("Typ F", "CEE 7/4", "Europa"); Version 1
		plugType = PlugType.TYPE_F;
		this.lightBulb = lightBulb;
		numberOfTableLights++;
	}

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

		if (isConnected == true && isOn == true && lightBulb != null) { /* isConnected reicht aus == unnötig */
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

	public LightBulb getLightBulb() {
		return lightBulb;
	}

	@Override
	public String toString() {
		return "TableLight [isConnected=" + isConnected + ", isOn= " + isOn + ", lightBulb=" + lightBulb + ", plugType="
				+ plugType + "]";
	}

	public static int getNumberOfTableLights() {
		return numberOfTableLights;
	}

}
