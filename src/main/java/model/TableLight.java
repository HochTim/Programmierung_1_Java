package model;

public final class TableLight extends Light implements Wired_Devices {

	private boolean isConnected;
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
@Override
	public void plugIn() throws AlredyPluggedInException{
	if (isConnected) {
		throw new AlredyPluggedInException();
	}
		isConnected = true;
	}

@Override
	public void pullThePlug() {
		isConnected = false;
	}

	public LightBulb changeLightBulp(LightBulb newLightBulp) {
		LightBulb oldLightBulp = lightBulb;
		lightBulb = newLightBulp;

		return oldLightBulp;
	}
	@Override
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
