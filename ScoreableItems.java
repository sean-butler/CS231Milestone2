package ccp;

import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;

public class ScoreableItems {
	
	private Set<Item> items;
	
	public ScoreableItems() {
		items = new HashSet<Item>();
		init();
	}
	
	private void init() {
		items.add(new Item("torch", 8, "Rock"));
		items.add(new Item("Centepede", -5, "Hill"));
		items.add(new Item("stick", 1, "Desert"));
		items.add(new Item("Bat", -10, "Oasis"));
		items.add(new Item("iron", 10, "Rock"));
		items.add(new Item("Spider", -15, "Hill"));
		items.add(new Item("water", 11, "Hill"));
		items.add(new Item("chorizo", 20, "Rock"));
	}
	
	public void displayCurrentItems(String location) {
		Iterator<Item> it = items.iterator();
		System.out.println("Current available items here:");
		Item thisItem;
		while (it.hasNext()) {
			thisItem = it.next();
			if (thisItem.getLocation().equals(location)) {
				System.out.println("    " + thisItem.getName() + ", worth " + thisItem.getScore() + " point(s)");
			}		
		}
	}
	
	public Item getItem(String name, String location) {
		Item thisItem;
		Iterator<Item> it = items.iterator();
		while (it.hasNext()) {
			thisItem = it.next();
			if (thisItem.getName().equalsIgnoreCase(name) && thisItem.getLocation().equals(location)) {
				System.out.println("Got the " + name + "!");
				it.remove();
				return thisItem;
			}
		}
		
		//in case not found the stuff after iterating
		System.out.println("Your requested stuff is not here OR Your command was not valid");
		return null;
	}

}
