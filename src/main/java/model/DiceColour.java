package model;

public enum DiceColour {
	
	CLUBS("Kreuz", 1), SPADE("Pik", 2),HEARTS("Herz",3),DIAMONDS("Karo", 4);
			
			private final String description;
			private final int priority;
			
		DiceColour(String description, int priority) {
			this.description = description;
			this.priority = priority;
		}
		
		public String toString() {
			return "description="+description+" priority="+ priority;
		}
			

}
