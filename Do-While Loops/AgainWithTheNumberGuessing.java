
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/again-with-the-number-guessing.html
 * Completed: December 27, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		int randomNumber = generator.nextInt(10) + 1;
		System.out.println("I have chosen a number between 1 and 10.");
		System.out.println("Try to guess it.");

		int guess;
		int tries = 1;
		System.out.print("Your guess: ");
		guess = sc.nextInt();
		do {
			if (guess != randomNumber) {
				System.out.println("That is incorrect. Guess again.");
				System.out.print("Your guess: ");
				guess = sc.nextInt();
				sc.nextLine();
				tries++;
			}
		} while (guess != randomNumber);
		sc.close();
		System.out.println("\nThat's right! The number was " + randomNumber + ". You are a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
	}
}