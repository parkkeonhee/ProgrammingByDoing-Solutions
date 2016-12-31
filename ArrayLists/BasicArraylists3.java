
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-arraylists-3.html
 * Completed: December 30, 2016
 */

import java.util.ArrayList;
import java.util.Random;

public class BasicArraylists3 {
	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int max = 1000;
		for (int i = 0; i < max; i++) {
			list.add(generator.nextInt(90) + 10);
			if (i % 20 == 0 && i != 0) {
				System.out.println();
			}
			if (i == 0) {
				System.out.print("[" + list.get(i) + ", ");
			} else if (i != 0 && i != max - 1) {
				System.out.print(list.get(i) + ", ");
			} else if (i == max - 1) {
				System.out.print(list.get(i) + "]");
			}
		}
	}
}