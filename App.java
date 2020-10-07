package Java_MIlestone_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		User user = new User("Critter");
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Welcome to the Mystical Adventure, you're in the middle of the desert...");
			System.out.println("To move select South(S), North(N), East(E), or West(W).. ");

			String moveDirection = s.nextLine();

			while (true) {
				user.move(moveDirection);
				
				System.out.println("here are your options: ");
				user.print();
				
				System.out.println("Where do you want to go? Select any direction N/S/E/W: ");
				moveDirection = s.nextLine();

				switch (moveDirection.toUpperCase()) {
				case "N":
					System.out.println("You've selected East...\n");
					user.move("N");
					break;

				case "S":
					System.out.println("You've selected North...\n");
					user.move("S");
					break;

				case "E":
					System.out.println("You've selected East...\n");
					user.move("E");
					break;

				case "W":
					System.out.println("You've selected West...\n");
					user.move("W");
					break;

				}
			}
		}
	}

}

