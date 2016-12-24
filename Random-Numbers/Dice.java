
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/dice.html
 * Completed: December 24, 2016
 */

import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println("HERE COMES THE DICE!\n");

		int rollFirst = generator.nextInt(6) + 1;
		int rollSecond = generator.nextInt(6) + 1;

		System.out.println("Roll #1: " + rollFirst + ".");
		System.out.println("Roll #2: " + rollSecond + ".");
		System.out.println("The total is " + (rollFirst + rollSecond) + "!");
	}
}