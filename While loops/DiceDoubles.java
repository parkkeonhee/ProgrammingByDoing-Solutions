
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/dice-doubles.html
 * Completed: December 25, 2016
 */

import java.util.Random;

public class DiceDoubles {
	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println("Here comes the dice!");

		int rollFirst = generator.nextInt(6) + 1;
		System.out.println("\nRoll #1: " + rollFirst + ".");

		int rollSecond = generator.nextInt(6) + 1;
		System.out.println("Roll #2: " + rollSecond + ".");
		System.out.println("The total is " + (rollFirst + rollSecond) + "!");

		while (rollFirst != rollSecond) {
			rollFirst = generator.nextInt(6) + 1;
			System.out.println("\nRoll #1: " + rollFirst + ".");
			rollSecond = generator.nextInt(6) + 1;
			System.out.println("Roll #2: " + rollSecond + ".");
			System.out.println("The total is " + (rollFirst + rollSecond) + "!");
		}
	}
}