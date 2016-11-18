
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/finding-the-largest-value-in-an-array.html
 * Completed: November 18, 2016
 */

import java.util.Random;

public class FindingTheLargestValueInAnArray {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("Array: ");
			}
			array[i] = generator.nextInt(100) + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int largestValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (largestValue <= array[i]) {
				largestValue = array[i];
			}
		}
		System.out.println("The largest value is " + largestValue);
	}
}