
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/locating-the-largest-value-in-an-arraylist.html
 * Completed: December 30, 2016
 */

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValueInAnArraylist {
	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();

		int max = 10;
		for (int i = 0; i < max; i++) {
			list.add(generator.nextInt(100) + 1);
			if (i == 0) {
				System.out.print("ArrayList: [" + list.get(i) + ", ");
			} else if (i != 0 && i != max - 1) {
				System.out.print(list.get(i) + ", ");
			} else if (i == max - 1) {
				System.out.print(list.get(i) + "]");
			}
		}

		int slot = 0;
		int largestValue = list.get(0);
		for (int i = 1; i < max; i++) {
			if (largestValue <= list.get(i)) {
				largestValue = list.get(i);
				slot = i;
			}
		}
		System.out.println("\n\nThe largest value is " + largestValue + ", which is in slot " + slot + ".");
	}
}