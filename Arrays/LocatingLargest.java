
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/locating-the-largest-value-in-an-array.html
 * Completed: December 30, 2016
 */

import java.util.Random;

public class LocatingLargest {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = generator.nextInt(100) + 1;
			if (i == 0) {
				System.out.print("Array: ");
			}
			if (i != array.length) {
				System.out.print(array[i] + " ");
			} else if (i == array.length) {
				System.out.print(array[i]);
			}
		}
		int largestValue = array[0];
		int largestValueSlot = -1;
		for (int i = 1; i < array.length; i++) {
			if (largestValue <= array[i]) {
				largestValue = array[i];
				largestValueSlot = i;
			}
		}

		System.out.println("\n\nThe largest value is " + largestValue + ".");
		System.out.println("It is in slot " + largestValueSlot + ".");
	}
}