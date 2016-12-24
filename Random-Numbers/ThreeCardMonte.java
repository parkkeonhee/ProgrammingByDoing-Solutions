
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/three-card-monte.html
 * Completed: December 24, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.");

		System.out.println("\nWhich one is the ace?\n");
		System.out.println("\t##  ##  ##");
		System.out.println("\t##  ##  ##");
		System.out.println("\t1   2   3");

		System.out.print("\nYour answer: ");
		int guess = sc.nextInt();
		sc.close();
		int answer = generator.nextInt(3) + 1;

		if (guess == answer) {
			System.out.println("\nYou nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
		} else {
			System.out.println("\nHa! Fast Eddie wins again! The ace was card number " + answer + ".");
		}

		if (answer == 1) {
			System.out.println("\n\tAA  ##  ##");
			System.out.println("\tAA  ##  ##");
		} else if (answer == 2) {
			System.out.println("\n\t##  AA  ##");
			System.out.println("\t##  AA  ##");
		} else if (answer == 3) {
			System.out.println("\n\t##  ##  AA");
			System.out.println("\t##  ##  AA");
		}
	}
}