package Java_MIlestone_1;

public class User {
	
	private String name;
	private final String STARTING_POSITION = "Desert";
	private Location location;

	public User(String name) {
		this.name = name;
		location = new Location(STARTING_POSITION);
	}

	public void move(String direction) {
		System.out.println(name + " is moving " + direction);
		location.move(direction);
		
	}

	public void showOptions() {
		

	}

	public String getPosition() {
		return STARTING_POSITION;
		
	}

	public void print() {
		
		System.out.println("What's good " + name);
		location.printCurrentOptions();
		
	}

}
