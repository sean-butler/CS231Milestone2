package ccp;

import java.util.ArrayList;
import java.util.List;

public class User {
	String STARTING_POSITION = "Desert";
	
	private String name;
	private Location location;
	private ArrayList<String> items;
	private int points = 0;

	public User(String name) {
		items = new ArrayList<>();
		location = new Location(STARTING_POSITION);
		this.name = name;
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

	public void move(String direction, ScoreableItems items) {
		checkForPointsOpp(direction, items);
		if (getCurrentPosition().equals("Desert")) {
			location.handleDesertMove(direction);
		} else if (getCurrentPosition().equals("Rock")) {
			location.handleRockMove(direction);
		} else if (getCurrentPosition().equals("Oasis")) {
			location.handleHillMove(direction);
		} else if (getCurrentPosition().equals("Hill")) {
			location.handleOasisMove(direction);
		} else
			System.out.print("Answer not found");

	}
	
	public void checkForPointsOpp(String direction, ScoreableItems items) {
		
	}
	
	

	public void handleDesertMove(String direction) {
		location.handleDesertMove(direction);
	}

	public void handleRockMove(String direction) {
		location.handleRockMove(direction);
	}

	public void handleOasisMove(String direction) {
		location.handleHillMove(direction);
	}

	public void handleHillMove(String direction) {
		location.handleOasisMove(direction);
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

}
