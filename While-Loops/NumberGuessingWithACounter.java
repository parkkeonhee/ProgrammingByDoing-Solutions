
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/number-guessing-with-a-counter.html
 * Completed: December 25, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		int randomNumber = generator.nextInt(10) + 1;

		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		int guess = sc.nextInt();

		int counter = 1;
		while (guess != randomNumber) {
			System.out.println("\nThat is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = sc.nextInt();
			counter++;
		}
		sc.close();

		System.out.println("\nThat's right! You're a good guesser.");
		System.out.println("It only took you " + counter + " tries to guess the number " + randomNumber + ".");
	}
}