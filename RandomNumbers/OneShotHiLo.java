
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/one-shot-hi-lo.html
 * Completed: December 24, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		int randomNumber = generator.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1-100.\nTry to guess it.\n");
		System.out.print("Your guess: ");
		int guess = sc.nextInt();

		sc.close();
		System.out.println();
		if (guess < randomNumber) {
			System.out.println("Sorry, you are too low.");
			System.out.println("I was thinking of number " + randomNumber + ".");
		} else if (guess > randomNumber) {
			System.out.println("Sorry, you are too high.");
			System.out.println("I was thinking of number " + randomNumber + ".");
		} else if (guess == randomNumber) {
			System.out.println("You guessed it right! What are the odds?!?");
		}
	}
}