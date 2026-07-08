package übungen;

public enum Enumerations01 {
	
	DIESEL("Diesel"),PETROL("Benzin"),GAS("Autogas"),ELECTRO("Elektro");
	
	private final String description;
	
	Enumerations01(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

}
