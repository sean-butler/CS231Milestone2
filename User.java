package cca;

import java.util.ArrayList;
import java.util.List;

public class User {
	Room STARTING_POSITION = Room.DESERT;
	
	private String name;
	private Location location;
	private List<Item> items;
	private int score;

	public User(String name) {
		items = new ArrayList<Item>();
		location = new Location(STARTING_POSITION);
		this.name = name;
		score = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}

	public void showCurrentOptions() {
		System.out.println("From " + location.getCurrentPosition() + ", " + "these are the following options:");
		System.out.println("North: " + location.getOptionNorth());
		System.out.println("South: " + location.getOptionSouth());
		System.out.println("East: " + location.getOptionEast());
		System.out.println("West: " + location.getOptionWest());
	}

	//process command input
	public void processCommand(String command, ScoreableItems items) {		
		switch (command.toLowerCase()) {
			case "i":
				// show instructions
				this.showInstructions();
				break;
				// show items @ current location
			case "items":
				items.displayCurrentItems(getCurrentPosition());
				break;
			case "bag":
				//show current bag
				this.showItems();
				break;
			case "n": case "w": case "e": case "s":
				this.move(command, items);
				break;
			default:
				// if command is not any of the cases mentioned, then assume that user wants an item
				String item = command;
				this.getItem(item, items);
		}
	}
	
	// to show instructions for user
	private void showInstructions() {
		String instructions = "Instructions:\n";
		instructions += "- Type a direction to move (N/E/S/W)\n";
		instructions += "- Type 'items' to see the items available at your current location\n";
		instructions += "- Type <item's name> to get an item\n";
		instructions += "- Type 'bag' to see all your items\n";
		System.out.println(instructions);
	}
	
	// move to direction: N/ S/ E/ W
	private void move(String command, ScoreableItems items) {
		Direction dir = null;
		switch (command.toLowerCase()) {
			case "n":
				dir = Direction.NORTH;
				location.handleMove(getCurrentPosition(), dir);
				break;
			case "e":
				dir = Direction.EAST;
				location.handleMove(getCurrentPosition(), dir);
				break;
			case "s":
				dir = Direction.SOUTH;
				location.handleMove(getCurrentPosition(), dir);
				break;
			case "w":
				dir = Direction.WEST;
				location.handleMove(getCurrentPosition(), dir);
				break;
		}
		
	}
	
	//get item
	private void getItem(String itemName, ScoreableItems items) {
		Item itemGotten = items.getItem(itemName, location.getCurrentPosition());
		if (!(itemGotten == null)) {
			this.items.add(itemGotten);
			this.score += itemGotten.getScore();
		}
	}

	public Room getCurrentPosition() {
		return location.getCurrentPosition();
	}

	public void setCurrentPosition(Room area) {
		location.setCurrentPosition(area);
	}

	public Room getOptionNorth() {
		return location.getOptionNorth();
	}

	public void setOptionNorth(Room area) {
		location.setOptionNorth(area);
	}

	public Room getOptionSouth() {
		return location.getOptionSouth();
	}

	public void setOptionSouth(Room area) {
		location.setOptionSouth(area);
	}

	public Room getOptionEast() {
		return location.getOptionEast();
	}

	public void setOptionEast(Room area) {
		location.setOptionEast(area);
	}

	public Room getOptionWest() {
		return location.getOptionWest();
	}

	public void setOptionWest(Room area) {
		location.setOptionWest(area);
	}
	
	// to show all items that user has
	private void showItems() {
		System.out.println("Items: ");
		for (Item item : this.items) {
			System.out.println("- " + item.getName());
		}
		System.out.println();
	}
}
