package model;

public class AlredyPluggedInException extends Exception{
	
	public AlredyPluggedInException() {
		super("Device already plugged in");
	}
}
