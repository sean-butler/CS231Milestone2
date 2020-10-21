package ccp;

public class Location {

	private String currentPosition;
	private String optionNorth;
	private String optionSouth;
	private String optionWest;
	private String optionEast;

	public String getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}

	public String getOptionNorth() {
		return optionNorth;
	}

	public void setOptionNorth(String optionNorth) {
		this.optionNorth = optionNorth;
	}

	public String getOptionSouth() {
		return optionSouth;
	}

	public void setOptionSouth(String optionSouth) {
		this.optionSouth = optionSouth;
	}

	public String getOptionWest() {
		return optionWest;
	}

	public void setOptionWest(String optionWest) {
		this.optionWest = optionWest;
	}

	public String getOptionEast() {
		return optionEast;
	}

	public void setOptionEast(String optionEast) {
		this.optionEast = optionEast;
	}

	public Location(String currentposition) {
		this.currentPosition = currentposition;
		optionNorth = "Rock";
		optionSouth = "Oasis";
		optionWest = "There is nothing in that direction";
		optionEast = "Hill";

	}

	public void handleDesertMove(String direction) {
		if (direction.equals("W") || direction.equals("w")) {
			currentPosition = "Desert";
			optionNorth = "Rock";
			optionSouth = "Oasis";
			optionEast = "Hill";
			optionWest = "hmm so you're not moving";
		}

		if (direction.equals("N") || direction.equals("n")) {
			currentPosition = "Rock";
			optionNorth = "--";
			optionSouth = "Oasis";
			optionEast = "Hill";
			optionWest = "Desert";
		}

		if (direction.equals("E") || direction.equals("e")) {
			currentPosition = "Hill";
			optionNorth = "Rock";
			optionSouth = "Oasis";
			optionEast = "--";
			optionWest = "Desert";
		}

		if (direction.equals("S") || direction.equals("s")) {
			currentPosition = "Oasis";
			optionNorth = "Rock";
			optionSouth = "--";
			optionEast = "Hill";
			optionWest = "Desert";
		}
		System.out.println("............");
		System.out.println("You have stumbled across a " + currentPosition);
		System.out.println("");
	}

	public void handleRockMove(String direction) {
		if (direction.equals("N") || direction.equals("n")) {
			currentPosition = "Rock";
			optionNorth = "--";
			optionSouth = "I don't know but I think we're still stranded";
			optionEast = "Hey, I think I see civilization up ahead";
			optionWest = "I don't know but I think we're still stranded";
		}

		if (direction.equals("S") || direction.equals("s")) {
			currentPosition = "Oasis";
			optionNorth = "Rock";
			optionSouth = "--";
			optionEast = "Hill";
			optionWest = "Desert";
		}
		
		if(direction.equals("E") || direction.equals("e")) {
			currentPosition = "Hill";
			optionNorth = "Rock";
			optionSouth = "Oasis";
			optionEast = "--";
			optionWest = "Desert";
		}
		
		if(direction.equals("W") || direction.equals("w")) {
			currentPosition = "Desert";
			optionNorth = "Rock";
			optionSouth = "Oasis";
			optionEast = "Hill";
			optionWest = "--";
		}
		System.out.println("............");
		System.out.println("You have stumbled across a " + currentPosition);
		System.out.println("");
	}

	public void handleHillMove(String direction) {
		if (direction.equals("E") || direction.equals("e")) {
			currentPosition = "Hill";
			optionNorth = "Rock";
			optionSouth = "Oasis";
			optionEast = "--";
			optionWest = "Desert";
		}

		if (direction.equals("W") || direction.equals("w")) {
			currentPosition = "Desert";
			optionNorth = "Rock";
			optionSouth = "Oasis";
			optionEast = "Hill";
			optionWest = "--";
		}
		
		if(direction.equals("N") || direction.equals("n")) {
			currentPosition = "Rock";
			optionNorth = "--";
			optionSouth = "Oasis";
			optionEast = "Hill";
			optionWest = "Desert";
		}
		
		if(direction.equals("S") || direction.equals("s")) {
			currentPosition = "Oasis";
			optionNorth = "Rock";
			optionSouth = "--";
			optionEast = "Hill";
			optionWest = "Desert";
		}
		System.out.println("............");
		System.out.println("You have stumbled across a " + currentPosition);
		System.out.println("");
	}

	public void handleOasisMove(String direction) {
		if (direction.equals("S") || direction.equals("s")) {
			currentPosition = "Oasis";
			optionNorth = "Rock";
			optionSouth = "--";
			optionEast = "Hill";
			optionWest = "Desert";
		}

		if (direction.equals("N") || direction.equals("n")) {
			currentPosition = "Rock";
			optionNorth = "--";
			optionSouth = "Oasis";
			optionEast = "Hill";
			optionWest = "Desert";
		}
		
		if(direction.equals("E") || direction.equals("e")) {
			currentPosition = "Hill";
			optionNorth = "Rock";
			optionSouth = "Oasis";
			optionEast = "--";
			optionWest = "Desert";
		}
		
		if(direction.equals("W") || direction.equals("w")) {
			currentPosition = "Desert";
			optionNorth = "Rock";
			optionSouth = "Oasis";
			optionEast = "Hill";
			optionWest = "--";
		}
		System.out.println("............");
		System.out.println("You have stumbled across a " + currentPosition);
		System.out.println("");

	}
}
