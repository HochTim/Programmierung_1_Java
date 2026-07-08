package model;

public class Toaster implements Wired_Devices {
	
	@Override
	public void plugIn() {
		System.out.println("ich, der Toaster bin jetzt eingesteckt");
	}
	
	@Override
	public void pullThePlug() {
		System.out.println("Ich, der Toaster bin eingesteckt");
	}

}
