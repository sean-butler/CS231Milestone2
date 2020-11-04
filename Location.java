package cca;

public class Location {

	private Room currentPosition;
	private Room optionNorth;
	private Room optionSouth;
	private Room optionWest;
	private Room optionEast;

	public Room getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Room currentPosition) {
		this.currentPosition = currentPosition;
	}

	public Room getOptionNorth() {
		return optionNorth;
	}

	public void setOptionNorth(Room optionNorth) {
		this.optionNorth = optionNorth;
	}

	public Room getOptionSouth() {
		return optionSouth;
	}

	public void setOptionSouth(Room optionSouth) {
		this.optionSouth = optionSouth;
	}

	public Room getOptionWest() {
		return optionWest;
	}

	public void setOptionWest(Room  optionWest) {
		this.optionWest = optionWest;
	}

	public Room getOptionEast() {
		return optionEast;
	}

	public void setOptionEast(Room optionEast) {
		this.optionEast = optionEast;
	}

	public Location(Room currentposition) {
		this.currentPosition = currentposition;
		optionNorth = Room.ROCK;
		optionSouth = Room.OASIS;
		optionWest = null;
		optionEast = Room.HILL;
	}
	
	public void handleMove(Room r, Direction dir) {
		
		switch(r) {
			case DESERT:
				handleDesertMove(dir);
				break;
			case ROCK:
				handleRockMove(dir);
				break;
			case OASIS:
				handleOasisMove(dir);
				break;
			case HILL:
				handleHillMove(dir);
		}
		
	}
	
	public void handleDesertMove(Direction dir) {
		Room oldPosition = currentPosition;
		switch (dir) {
			case NORTH:
				currentPosition = Room.ROCK;
				optionNorth = null;
				optionSouth = Room.DESERT;
				optionEast = null;
				optionWest = null;
				break;
			case EAST:
				currentPosition = Room.HILL;
				optionNorth = null;
				optionSouth = null;
				optionEast = null;
				optionWest = Room.DESERT;
				break;
			case SOUTH:
				currentPosition = Room.OASIS;
				optionNorth = Room.DESERT;
				optionSouth = null;
				optionEast = null;
				optionWest = null;
				break;
			case WEST:
				currentPosition = Room.DESERT;
				optionNorth = Room.ROCK;
				optionSouth = Room.OASIS;
				optionEast = Room.HILL;
				optionWest = null;
				break;
		}
		print(oldPosition);
	}
		
	public void handleRockMove(Direction dir) {
		Room oldPosition = currentPosition;
		switch (dir) {
			case NORTH: case EAST: case WEST:
				currentPosition = Room.ROCK;
				optionNorth = null;
				optionSouth = Room.DESERT;
				optionEast = null;
				optionWest = null;
				break;		
			case SOUTH:
				currentPosition = Room.DESERT;
				optionNorth = Room.ROCK;
				optionSouth = Room.OASIS;
				optionEast = Room.HILL;
				optionWest = null;
				break;
		}
		print(oldPosition);
	}
	
	public void handleHillMove(Direction dir) {
		Room oldPosition = currentPosition;
		switch (dir) {
			case NORTH: case EAST: case SOUTH:
				currentPosition = Room.HILL;
				optionNorth = null;
				optionSouth = null;
				optionEast = null;
				optionWest = Room.DESERT;
				break;
			case WEST:
				currentPosition = Room.DESERT;
				optionNorth = Room.ROCK;
				optionSouth = Room.OASIS;
				optionEast = Room.HILL;
				optionWest = null;
				break;
		}
		print(oldPosition);
	}
	
	public void handleOasisMove(Direction dir) {
		Room oldPosition = currentPosition;
		switch (dir) {
			case EAST: case SOUTH: case WEST:
				currentPosition = Room.OASIS;
				optionNorth = Room.DESERT;
				optionSouth = null;
				optionEast = null;
				optionWest = null;
				break;
			case NORTH:
				currentPosition = Room.DESERT;
				optionNorth = Room.ROCK;
				optionSouth = Room.OASIS;
				optionEast = Room.HILL;
				optionWest = null;
				break;
		}	
		print(oldPosition);
	}
	
	public void print(Room oldPosition) {
		
		System.out.println("............");
		if (!oldPosition.equals(currentPosition)) {
			System.out.println("You have stumbled across a " + currentPosition);
		} else {
			System.out.println("You are still stuck at the " + currentPosition);
		}
		System.out.println("");
		
	}

	public void setCurrentPosition(String area) {
		// TODO Auto-generated method stub
		
	}
}