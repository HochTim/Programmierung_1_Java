package model;

public class Circle extends Shape{
	
	private final double rInCm;
	private double areaInCm2, circumferenceInCm;
	
	public Circle(double rInCm) {
		this.rInCm = rInCm;
	}
	
	@Override
	public double getAreaInCm2() {
		areaInCm2 = Math.PI * rInCm * rInCm;
		return areaInCm2;
	}
	
	@Override
	public double getCircumferenceInCm() {
		circumferenceInCm = 2 * Math.PI * rInCm;
		return circumferenceInCm;
	}
	
	@Override
	public String toString() {
		return "Cirle [ aInCm="+rInCm+" ]";
	}

}
