package model;

public class Square extends Rectangel{
	
	
	public Square(double aInCm) {
		super(aInCm, aInCm);
	}
	
	@Override
	public String toString() {
		return "Cirle [ aInCm="+aInCm+" ]";
	}
}
