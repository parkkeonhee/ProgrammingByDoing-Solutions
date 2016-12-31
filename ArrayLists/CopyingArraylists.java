
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/copying-arraylists.html
 * Completed: December 30, 2016
 */

import java.util.ArrayList;
import java.util.Random;

public class CopyingArraylists {
	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int max = 10;

		for (int i = 0; i < max; i++) {
			list.add(generator.nextInt(100) + 1);
		}
		ArrayList<Integer> listTwo = new ArrayList<Integer>(list);
		list.add(list.size() - 1, -7);
		for (int i = 0; i < max; i++) {
			if (i == 0) {
				System.out.print("ArrayList 1: [" + list.get(i) + ", ");
			} else if (i != 0 && i != max - 1) {
				System.out.print(list.get(i) + ", ");
			} else if (i == max - 1) {
				System.out.print(list.get(i) + "]");
			}
		}

		System.out.println();

		for (int i = 0; i < max; i++) {
			if (i == 0) {
				System.out.print("ArrayList 2: [" + listTwo.get(i) + ", ");
			} else if (i != 0 && i != max - 1) {
				System.out.print(listTwo.get(i) + ", ");
			} else if (i == max - 1) {
				System.out.print(listTwo.get(i) + "]");
			}
		}
	}
}