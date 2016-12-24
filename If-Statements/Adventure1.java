
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/choose-your-own-short-adventure.html
 * Completed: December 24, 2016
 */

import java.util.Scanner;

public class Adventure1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Mitchell's Tiny Adventure!");

		System.out.println("\nYou are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
		String house = sc.nextLine();

		if (house.equalsIgnoreCase("kitchen")) {
			System.out.println(
					"\nThere is a long countertop with dirty dishes everywhere.\nOff to one side there is, as you'd expect, a refrigerator.\nYou may open the \"refrigerator\" or look in a \"cabinet\".");
			String kitchen = sc.nextLine();
			if (kitchen.equalsIgnoreCase("refrigerator")) {
				System.out.println(
						"\nInside the refrigerator, you see food and stuff.\nIt looks pretty nasty.\nWould you like to eat some of the food? (\"yes\" or \"no\")");
				String refrigerator = sc.nextLine();
				if (refrigerator.equalsIgnoreCase("no")) {
					System.out.println("\nYou die of starvation... eventually.");
				}
			}
		} else if (house.equalsIgnoreCase("upstairs")) {
			System.out.println(
					"\nUpstairs you see a hallway.\nAt the end of the hallway is the master \"bedroom\".\nThere is also a \"bathroom\" off the hallway.\nWhere would you like to go?");
			String upstairs = sc.nextLine();
			if (upstairs.equalsIgnoreCase("bedroom")) {
				System.out.println(
						"\nYou are in a plush bedroom, with expensive-looking hardwood furniture.\nThe bed is unmade.\nIn the back of the room, the closet door is ajar.\nWould you like to open the door? (\"yes\" or \"no\")");
				String bedroom = sc.nextLine();
				if (bedroom.equalsIgnoreCase("no")) {
					System.out.println(
							"\nWell, then I guess you'll never know what was in there.\nThanks for playing, I'm tired of making nested if statements.");
				}
			}
		}
		sc.close();
	}
}