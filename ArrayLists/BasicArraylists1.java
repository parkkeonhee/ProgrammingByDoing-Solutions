
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-arraylists-1.html
 * Completed: December 30, 2016
 */

import java.util.ArrayList;

public class BasicArraylists1 {
	public static void main(String[] args) {
		final int max = 10;
		ArrayList<Integer> list = new ArrayList<Integer>(max);

		for (int i = 0; i < max; i++) {
			list.add(-113);
			System.out.println("Slot " + i + " contains a " + list.get(i) + ".");
		}
	}
}