
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/hi-lo-with-limited-tries.html
 * Completed: December 25, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		final int maxTries = 7;

		int theNumber = generator.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1-100. You have " + maxTries + " guesses.");

		System.out.print("First guess: ");
		int guess = sc.nextInt();

		int counter = 1;
		while (guess != theNumber && counter != maxTries) {
			counter++;
			if (guess < theNumber) {
				System.out.println("\nSorry, you are too low.");
			} else if (guess > theNumber) {
				System.out.println("\nSorry, you are too high.");
			}
			System.out.print("Guess #" + counter + ": ");
			guess = sc.nextInt();
		}
		sc.close();

		if (guess == theNumber) {
			System.out.println("\nYou guessed it in " + counter + " tries! What are the odds?!?");
			System.out.println("It was number " + theNumber + ".");
		} else {
			System.out.println("\nSorry, you lost. You didn't guess it in " + maxTries + " tries.");
			System.out.println("The number was " + theNumber + ".");
		}
	}
}