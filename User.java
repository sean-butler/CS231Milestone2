package ccp;

import java.util.ArrayList;
import java.util.List;

public class User {
	String STARTING_POSITION = "Desert";
	
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
				break;
			case "e":
				dir = Direction.EAST;
				break;
			case "s":
				dir = Direction.SOUTH;
				break;
			case "w":
				dir = Direction.WEST;
				break;
		}
		
		if (getCurrentPosition().equals("Desert")) {
			location.handleDesertMove(dir);
		} else if (getCurrentPosition().equals("Rock")) {
			location.handleRockMove(dir);
		} else if (getCurrentPosition().equals("Oasis")) {
			location.handleOasisMove(dir);
		} else if (getCurrentPosition().equals("Hill")) {
			location.handleHillMove(dir);
		} else
			System.out.print("Answer not found");
	}
	
	//get item
	private void getItem(String itemName, ScoreableItems items) {
		Item itemGotten = items.getItem(itemName, location.getCurrentPosition());
		if (!(itemGotten == null)) {
			this.items.add(itemGotten);
			this.score += itemGotten.getScore();
		}
	}

	public String getCurrentPosition() {
		return location.getCurrentPosition();
	}

	public void setCurrentPosition(String area) {
		location.setCurrentPosition(area);
	}

	public String getOptionNorth() {
		return location.getOptionNorth();
	}

	public void setOptionNorth(String area) {
		location.setOptionNorth(area);
	}

	public String getOptionSouth() {
		return location.getOptionSouth();
	}

	public void setOptionSouth(String area) {
		location.setOptionSouth(area);
	}

	public String getOptionEast() {
		return location.getOptionEast();
	}

	public void setOptionEast(String area) {
		location.setOptionEast(area);
	}

	public String getOptionWest() {
		return location.getOptionWest();
	}

	public void setOptionWest(String area) {
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
