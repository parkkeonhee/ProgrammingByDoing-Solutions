
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/safe-square-root.html
 * Completed: November 12, 2016
 */

import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean positive = false;
		int userInput;

		System.out.println("SQUARE ROOT!");
		do {
			System.out.print("Enter a number: ");
			userInput = sc.nextInt();
			if (userInput < 0) {
				System.err.println("You cannot take the square root of a negative number, silly.");
			} else {
				System.out.println("The square root of " + userInput + " is " + Math.sqrt(userInput) + ".");
				positive = true;
			}
		} while (!positive);
		sc.close();
	}
}
