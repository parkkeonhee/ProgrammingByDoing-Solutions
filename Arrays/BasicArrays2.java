
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-arrays-2.html
 * Completed: November 18, 2016
 */

import java.util.Random;

public class BasicArrays2 {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] arrays = new int[10];

		for (int i = 0; i < arrays.length; i++) {
			System.out.println("Slot " + i + " contains a " + (generator.nextInt(100) + 1));
		}
	}
}