
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/adventure2.html
 * Completed: December 27, 2016
 */

import java.util.Scanner;

public class Adventure2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mitchell's Tiny Adventure 2!\n");
		String userDestination = "";
		int nextRoom = 1;
		while (nextRoom != 0) {
			if (nextRoom == 1) {
				System.out.println("You are in a creepy house!");
				System.out.println("Would you like to go \"upstairs\" or into the \"kitchen\"?");
				System.out.print("I would like to go to: ");
				userDestination = sc.nextLine();
				System.out.println("\nOkay, you chose to go to " + userDestination + ".");
				if (userDestination.equalsIgnoreCase("upstairs")) {
					nextRoom = 2;
				} else if (userDestination.equalsIgnoreCase("kitchen")) {
					nextRoom = 3;
				} else {
					System.out.println(userDestination + " does not exist.");
					System.out.println("Try again.\n");
				}
			}
			if (nextRoom == 2) {
				System.out.println("Upstairs, you see a hallway.");
				System.out.println("At the end of the hallway is the master \"bedroom\".");
				System.out.println("There is also a \"bathroom\" off the hallway.");
				System.out.println("Or, you can go back \"downstairs\".");
				System.out.println("Where would you like to go?");
				System.out.print("I would like to go to: ");
				userDestination = sc.nextLine();
				System.out.println("\nOkay, you chose to go to " + userDestination + ".");
				if (userDestination.equalsIgnoreCase("bedroom") || userDestination.equalsIgnoreCase("bathroom")) {
					nextRoom = 4;
				} else if (userDestination.equalsIgnoreCase("downstairs")) {
					nextRoom = 1;
				} else {
					System.out.println(userDestination + " does not exist.");
					System.out.println("Try again.\n");
				}
			}
			if (nextRoom == 3) {
				System.out.println("There is a long countertop with dirty dishes everywhere.");
				System.out.println("Off to one side there is, as you'd expect, a refrigerator.");
				System.out.println("You may open the \"refrigerator\" or go \"back\".");
				System.out.print("I would like to go to: ");
				userDestination = sc.nextLine();
				System.out.println("\nOkay, you chose to go to " + userDestination + ".");
				if (userDestination.equalsIgnoreCase("refrigerator")) {
					nextRoom = 5;
				} else if (userDestination.equalsIgnoreCase("back")) {
					nextRoom = 1;
				} else {
					System.out.println(userDestination + " does not exist.");
					System.out.println("Try again.\n");
				}
			}
			if (nextRoom == 4) {
				System.out.println("You have died.");
				nextRoom = 0;
			}
			if (nextRoom == 5) {
				System.out.println("Inside the refrigerator, you see food and stuff.");
				System.out.println("It looks pretty nasty.");
				System.out.println("Would you like to eat some of the food? (\"Yes\" or \"No\")");
				userDestination = sc.nextLine();

				if (userDestination.equalsIgnoreCase("yes")) {
					System.out.println("\nThe food is slimy and foul, but you managed to choke it down.");
					System.out.println("Your stomach starts jumping like a frog in hot water.");
					System.out.println("You feel faint.");
					System.out.println("Sliding to the floor, the darkness closes in.");
					System.out.println("\nYou have died.");
					nextRoom = 0;
				} else if (userDestination.equalsIgnoreCase("no")) {
					System.out.println("\nYou closed the refrigerator and is still in the kitchen.");
					nextRoom = 3;
				} else {
					System.out.println(userDestination + " does not exist.");
					System.out.println("Try again\n");
				}
			}
		}
		sc.close();
	}
}
