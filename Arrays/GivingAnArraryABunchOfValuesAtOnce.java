
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/giving-an-array-a-bunch-of-values-at-once.html
 * Completed: December 30, 2016
 */

import java.util.Random;

public class GivingAnArraryABunchOfValuesAtOnce {
	public static void main(String[] args) {
		Random generator = new Random();
		String[] arrayFirst = { "alpha", "bravo", "charlie", "delta", "echo" };
		int[] arraySecond = new int[5];

		System.out.println("The first array is filled with the following values:");
		for (int i = 0; i < arrayFirst.length; i++) {
			if (i == 0) {
				System.out.print("\t");
			}
			if (i != arrayFirst.length) {
				System.out.print(arrayFirst[i] + " ");
			} else if (i == arrayFirst.length) {
				System.out.print(arrayFirst[i]);
			}
		}

		System.out.println("\nThe second array is filled with the following values:");
		for (int i = 0; i < arraySecond.length; i++) {
			arraySecond[i] = generator.nextInt(100) + 1;
			if (i == 0) {
				System.out.print("\t");
			}
			if (i != arraySecond.length) {
				System.out.print(arraySecond[i] + " ");
			} else if (i == arraySecond.length) {
				System.out.print(arraySecond[i]);
			}
		}
	}
}