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
	
	public void handleDesertMove(Direction dir) {
		String oldPosition = currentPosition;
		
		switch (dir) {
			case NORTH:
				currentPosition = "Rock";
				optionNorth = "--";
				optionSouth = "Desert";
				optionEast = "--";
				optionWest = "--";
				break;
			case EAST:
				currentPosition = "Hill";
				optionNorth = "--";
				optionSouth = "--";
				optionEast = "--";
				optionWest = "Desert";
				break;
			case SOUTH:
				currentPosition = "Oasis";
				optionNorth = "Desert";
				optionSouth = "--";
				optionEast = "--";
				optionWest = "--";
				break;
			case WEST:
				currentPosition = "Desert";
				optionNorth = "Rock";
				optionSouth = "Oasis";
				optionEast = "Hill";
				optionWest = "--";
				break;
		}
		
		// this part is repetitive with other methods -> write a separate method for this part.
		System.out.println("............");
		if (!oldPosition.equals(currentPosition)) {
			System.out.println("You have stumbled across a " + currentPosition);
		} else {
			System.out.println("You are still stuck there.");
		}
		System.out.println();
	}
	
	public void handleRockMove(Direction dir) {
		String oldPosition = currentPosition;
		switch (dir) {
			case NORTH: case EAST: case WEST:
				currentPosition = "Rock";
				optionNorth = "--";
				optionSouth = "Desert";
				optionEast = "--";
				optionWest = "--";
				break;		
			case SOUTH:
				currentPosition = "Desert";
				optionNorth = "Rock";
				optionSouth = "Oasis";
				optionEast = "Hill";
				optionWest = "--";
				break;
		}
		
		System.out.println("............");
		if (!oldPosition.equals(currentPosition)) {
			System.out.println("You have stumbled across a " + currentPosition);
		} else {
			System.out.println("You are still stuck there.");
		}
		
		System.out.println("");
	}
	
	public void handleHillMove(Direction dir) {
		String oldPosition = currentPosition;
		
		switch (dir) {
			case NORTH: case EAST: case SOUTH:
				currentPosition = "Hill";
				optionNorth = "--";
				optionSouth = "--";
				optionEast = "--";
				optionWest = "Desert";
				break;
			case WEST:
				currentPosition = "Desert";
				optionNorth = "Rock";
				optionSouth = "Oasis";
				optionEast = "Hill";
				optionWest = "--";
				break;
		}
		System.out.println("............");
		if (!oldPosition.equals(currentPosition)) {
			System.out.println("You have stumbled across a " + currentPosition);
		} else {
			System.out.println("You are still stuck at the " + currentPosition);
		}
		System.out.println("");
	}
	
	public void handleOasisMove(Direction dir) {
		String oldPosition = currentPosition;
		switch (dir) {
			case EAST: case SOUTH: case WEST:
				currentPosition = "Oasis";
				optionNorth = "Desert";
				optionSouth = "--";
				optionEast = "--";
				optionWest = "--";
				break;
			case NORTH:
				currentPosition = "Desert";
				optionNorth = "Rock";
				optionSouth = "Oasis";
				optionEast = "Hill";
				optionWest = "--";
				break;
		}
		System.out.println("............");
		if (!oldPosition.equals(currentPosition)) {
			System.out.println("You have stumbled across a " + currentPosition);
		} else {
			System.out.println("You are still stuck at the " + currentPosition);
		}
		System.out.println("");
		
	}

}
