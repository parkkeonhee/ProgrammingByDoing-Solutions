
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/a-number-guessing-game.html
 * Completed: December 24, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		int guess = sc.nextInt();
		sc.close();

		int theNumber = generator.nextInt(10) + 1;
		System.out.println();
		if (guess == theNumber) {
			System.out.println("That's right! My secret number was " + theNumber + "!");
		} else {
			System.out.println("Sorry, but I was really thinking of " + theNumber + ".");
		}
	}
}