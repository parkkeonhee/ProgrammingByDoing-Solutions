
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/flip-again.html
 * Completed: December 27, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		String playAgain = "";
		do {
			int flip = generator.nextInt(2);
			System.out.print("You flip a coin and it is... ");

			if (flip == 0) {
				System.out.print("HEADS");
			} else if (flip == 1) {
				System.out.print("TAILS");
			}
			System.out.print("\nWould you like to flip again (y/n)? ");
			playAgain = sc.nextLine();
			System.out.println();
		} while (!playAgain.equalsIgnoreCase("n"));
		sc.close();
	}
}