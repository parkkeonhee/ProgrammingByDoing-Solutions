
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/randomness.html
 * Completed: December 24, 2016
 */

import java.util.Random;

public class Randomness {
	public static void main(String[] args) {
		Random generator = new Random();
		int x = generator.nextInt(10);
		System.out.println("My random number is " + x + ".");
		System.out.println("Here are some numbers from 1 to 5!");

		for (int i = 0; i < 6; i++) {
			if (i != 5) {
				System.out.print((generator.nextInt(5) + 1) + " ");
			} else {
				System.out.print((generator.nextInt(5) + 1));
			}
		}

		System.out.println("\nHere are some numbers from 1 to 100!");
		for (int i = 0; i < 6; i++) {
			if (i != 5) {
				System.out.print((generator.nextInt(100) + 1) + "\t");
			} else {
				System.out.print(generator.nextInt(100) + 1);
			}
		}
		System.out.println("The random numbers were different! Not too surprising, actually.");
	}
}