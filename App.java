package ccp;

import java.util.Scanner;

public class App {

	static ScoreableItems caveItems;

	public static void main(String[] args) {
		System.out.println("Welcome to the Colossal Desert Advernture!");
		System.out.println("You are currently stranded in the desert and trying to make you're way home");
		System.out.println("");
		
		System.out.println("By the way, what's your name?");
		caveItems = new ScoreableItems();
		Scanner name = new Scanner(System.in);
		String playerName = name.nextLine();
		User player = new User(playerName);
		System.out.println("Nice to meet you " + player.getName());
		System.out.println("");

		action(player);
		name.close();

	}

	public static void action(User player) {
		Scanner playerChoice = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			player.showCurrentOptions();
			System.out.println("");
			System.out.println("So where are we headed of to? ");
			String direction = playerChoice.nextLine();
			player.move(direction);
		}
		playerChoice.close();
	}

}
