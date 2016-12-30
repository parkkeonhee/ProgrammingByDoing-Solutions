
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-arrays-2.html
 * Completed: December 30, 2016
 */

import java.util.Random;

public class BasicArrays2 {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = generator.nextInt(100) + 1;
			System.out.println("Slot " + i + " contains a " + array[i] + ".");
		}
	}
}