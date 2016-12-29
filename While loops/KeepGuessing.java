
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/keep-guessing.html
 * Completed: December 25, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		int theNumber = generator.nextInt(10) + 1;
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		int guess = sc.nextInt();

		while (guess != theNumber) {
			System.out.println("\nThat is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = sc.nextInt();
		}
		sc.close();
		System.out.println("\nThat's right! The number is " + theNumber + ". You're a good guesser.");
	}
}