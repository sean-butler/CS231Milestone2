package ccp;

import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;

public class ScoreableItems {

	private Map<String, Integer> items;

	public ScoreableItems() {
		items = new HashMap<>();
		init();
	}

	private void init() {
		items.put("torch", 8);
		items.put("Centepide", -5);
		items.put("stick", 1);
		items.put("Bat", -10);
		items.put("iron", 10);
		items.put("Spider", -15);
		items.put("water", 11);
		items.put("chorizo", 20);
	}

	public void displayCurrentItems() {
		Set<String> s = items.keySet();
		Iterator<String> it = s.iterator();
		System.out.println("Current available items ");
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + ": " + items.get(key));
		}
	}

	public Integer getItem(String Key) {
		Integer points = items.get(Key);
		items.remove(Key);
		return points;
	}

}
