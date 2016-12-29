
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/the-worst-number-guessing-game-ever.html
 * Completed: December 24, 2016
 */

import java.util.Scanner;

public class WorstGuessing {
	public static void main(String[] args) {
		final int theNumber = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("THE WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.print("\nI'M THKING OF A NBR FROM 1-10.\tTRY 2 GESS! ");
		int guess = sc.nextInt();
		sc.close();

		if (guess == theNumber) {
			System.out.println("\nLOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + theNumber + "!");
		} else {
			System.out.println("\nW00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + theNumber + "!");
		}
	}
}