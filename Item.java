package ccp;

public class Item {
	private String name;    ///write name and score as const??
	private int score;
	private String location;
	
	public Item(String name, int score, String location) {
		this.name = name;
		this.score = score;
		this.location = location; 
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
}
