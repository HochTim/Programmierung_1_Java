package model;

public class Rectangel extends Shape {
	
	protected final double aInCm;
	protected final double bInCm;
	protected double areaInCm2,circumference;
	
	public Rectangel(double aInCm, double bInCm) {
		this.aInCm = aInCm;
		this.bInCm = bInCm;
	}
	
	@Override
	public double getAreaInCm2() {
		areaInCm2 = aInCm * bInCm;
		return areaInCm2;
	}
	
	@Override
	public double getCircumferenceInCm() {
		circumference = 2 * aInCm + 2 * bInCm;
		return circumference;
	}
	
	@Override
	public String toString() {
		return "Rectangel [ aInCm="+aInCm+" bInCm="+bInCm+" ]";
	}
	
}
