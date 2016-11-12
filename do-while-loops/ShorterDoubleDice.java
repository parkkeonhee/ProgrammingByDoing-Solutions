
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/shorter-double-dice.html
 * Completed: November 12, 2016
 */
import java.util.Random;

public class ShorterDoubleDice {
	public static void main(String[] args) {
		Random generator = new Random();
		boolean different = false;
		int[] rolls = new int[2];

		System.out.println("HERE COME THE DICE!");
		int i = 0;
		do {
			for (int k = 0; k < rolls.length; k++) {
				rolls[k] = generator.nextInt(11) + 1;
			}
			System.out.println();
			System.out.println("Roll #1: " + rolls[i]);
			System.out.println("Roll #2: " + rolls[i + 1]);
			System.out.println("The total is " + (rolls[i] + rolls[i + 1]) + "!");
			different = rolls[i] == rolls[i + 1] ? true : false;
		} while (!different);
	}
}