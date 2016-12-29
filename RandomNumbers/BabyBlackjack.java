
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/baby-blackjack.html
 * Completed: December 27, 2016
 */

import java.util.Random;

public class BabyBlackjack {
	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println("Baby Blackjack!");

		int oneFirst = generator.nextInt(10) + 1;
		int oneSecond = generator.nextInt(10) + 1;
		int oneTotal = oneFirst + oneSecond;

		int dealerFirst = generator.nextInt(10) + 1;
		int dealerSecond = generator.nextInt(10) + 1;
		int dealerTotal = dealerFirst + dealerSecond;

		System.out.println("\nYou drew " + oneFirst + " and " + oneSecond + ".");
		System.out.println("Your total is " + oneTotal + ".");
		System.out.println("\nThe dealer has " + dealerFirst + " and " + dealerSecond + ".");
		System.out.println("Dealer's total is " + dealerTotal + ".\n");

		if (oneTotal > dealerTotal) {
			System.out.println("You win!");
		} else if (dealerTotal > oneTotal) {
			System.out.println("You lost!");
		} else {
			System.out.println("You tied!");
		}
	}
}