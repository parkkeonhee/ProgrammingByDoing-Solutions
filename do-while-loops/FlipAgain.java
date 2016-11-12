
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/flip-again.html
 * Completed: November 12, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		String response, flippedCoin = "";
		int numberOfHeads = 0, numberOfTails = 0;
		int flippedNumber;
		do {
			flippedNumber = generator.nextInt(2);
			flippedCoin = flippedNumber == 1 ? "HEADS" : "TAILS";
			if (flippedNumber == 1) {
				numberOfHeads++;
			} else {
				numberOfTails++;
			}
			System.out.print("You flip a coin and it is... " + flippedCoin);
			System.out.println();
			System.out.print("Would you like to flip again (y/n)? ");
			response = sc.nextLine();
		} while (response.equalsIgnoreCase("y"));
		sc.close();
		int totalCoinFlips = numberOfHeads + numberOfTails;
		System.out.println("There were " + numberOfHeads + " heads, " + numberOfTails + " tails, and total of "
				+ (totalCoinFlips) + " coin flips.");
	}
}
