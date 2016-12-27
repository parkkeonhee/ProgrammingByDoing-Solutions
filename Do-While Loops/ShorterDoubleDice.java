
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/shorter-double-dice.html
 * Completed: December 27, 2016
 */

import java.util.Random;

public class ShorterDoubleDice {
	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println("Here comes the dice!");
		int rollFirst, rollSecond;

		do {
			rollFirst = generator.nextInt(6) + 1;
			rollSecond = generator.nextInt(6) + 1;
			System.out.println("\nRoll #1: " + rollFirst + ".");
			System.out.println("Roll #2: " + rollSecond + ".");
			System.out.println("The total is " + (rollFirst + rollSecond) + "!");
		} while (rollFirst != rollSecond);
	}
}