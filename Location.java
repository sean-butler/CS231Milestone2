package Java_MIlestone_1;

public class Location {

	private String currentPosition;
	private String optionNorth;
	private String optionSouth;
	private String optionWest;
	private String optionEast;
	
	public Location(String initialPosition) {
		this.currentPosition = initialPosition;
		optionNorth = "-";
		optionSouth = "-";
		optionWest = "-";
		optionEast = "-";
		
	}

	public void move(String direction) {
		String originalPosition = currentPosition;
		
		if(currentPosition.equals("Desert"))

		if (currentPosition.equalsIgnoreCase("S")) {
			handleDesert0Move(direction);

		}

		else if (currentPosition.equalsIgnoreCase("N")) {
			handleDesert1Move(direction);
		}

		else if (currentPosition.equalsIgnoreCase("W")) {
			handleDesert2Move(direction);
		}

		else if (currentPosition.equalsIgnoreCase("E")) {
			handleDesert3Move(direction);
		}
		

	}

	private void handleDesert0Move(String direction) {
		if (direction == "S") {
			currentPosition = "Desert0";
		}

		if (direction == "N" || direction == "W" || direction == "E") {
			currentPosition = "Desert";
			System.out.println("You're still stuck in the middle of the desert");

		}
	}

	private void handleDesert1Move(String direction) {
		if (direction == "N") {
			currentPosition = "Desert1";
		}

		if (direction == "S" || direction == "W" || direction == "E") {
			currentPosition = "Desert";
			System.out.println("You're still stuck in the middle of the desert");
		}
	}

	private void handleDesert2Move(String direction) {
		if (direction == "W") {
			currentPosition = "Desert2";
		}

		if (direction == "S" || direction == "N" || direction == "E") {
			currentPosition = "Desert";
			System.out.println("You're still stuck in the middle of the desert");
		}
	}

	private void handleDesert3Move(String direction) {
		if (direction == "E") {
			currentPosition = "Desert3";
		}

		if (direction == "S" || direction == "N" || direction == "W") {
			currentPosition = "Desert";
			System.out.println("You're still stuck in the middle of the desert");
		}

	}
	
	private void setDesert0Options() {
		optionNorth = "";
		optionSouth = "";
		optionEast = "";
		optionWest = "";
	}
	
	private void setDesert1Options() {
		optionNorth = "";
		optionSouth = "";
		optionEast = "";
		optionWest = "";
	}
	
	private void setDesert2Options() {
		optionNorth = "";
		optionSouth = "";
		optionEast = "";
		optionWest = "";
	}
	
	private void setDesert3Options() {
		optionNorth = "";
		optionSouth = "";
		optionEast = "";
		optionWest = "";
	}

	public void printCurrentOptions() {
		System.out.println(" current location: " + currentPosition);

		System.out.println(" option east: " + optionEast);
		System.out.println(" option west: " + optionWest);
		System.out.println(" option north: " + optionNorth);
		System.out.println(" option south: " + optionSouth);
		
	}

}
