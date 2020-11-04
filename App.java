 package cca;
 	
 	import java.util.Scanner;

 	public class App {

 		static ScoreableItems caveItems;

 		public static void main(String[] args) {
 			System.out.println("Welcome to the Colossal Desert Adventure!");
 			System.out.println("You are currently stranded in the desert and trying to make your way home");
 			System.out.println("");
 			
 			System.out.println("By the way, what's your name?");
 			caveItems = new ScoreableItems();
 			Scanner name = new Scanner(System.in);
 			String playerName = name.nextLine();
 			User player = new User(playerName);
 			System.out.println("Nice to meet you " + player.getName());
 			System.out.println("");
 			action(player, caveItems);
 			
 			name.close();
 		}

 		public static void action(User player, ScoreableItems caveItems) {
 			
 			Scanner playerChoice = new Scanner(System.in);
 			String command;
 			int score = player.getScore();
 			while (score < 50) {
 				player.showCurrentOptions();
 				System.out.println("");
 				System.out.println("So what do you wanna do? (Or type 'i' to get instructions)");
 				command = playerChoice.nextLine();
 				player.processCommand(command, caveItems);
 			}
 			playerChoice.close();
 		}
 	}