
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/sorting-an-arraylist.html
 * Completed: December 30, 2016
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortingAnArraylist {
	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Integer> listOne = new ArrayList<Integer>();

		int max = 10;
		for (int i = 0; i < max; i++) {
			listOne.add(generator.nextInt(90) + 10);
			if (i == 0) {
				System.out.print("ArrayList before: [" + listOne.get(i) + ", ");
			} else if (i != 0 && i != max - 1) {
				System.out.print(listOne.get(i) + ", ");
			} else if (i == max - 1) {
				System.out.print(listOne.get(i) + "]");
			}
		}
		ArrayList<Integer> listTwo = new ArrayList<Integer>(listOne);
		Collections.sort(listTwo);

		System.out.println();
		for (int i = 0; i < max; i++) {
			if (i == 0) {
				System.out.print("ArrayList after : [" + listTwo.get(i) + ", ");
			} else if (i != 0 && i != max - 1) {
				System.out.print(listTwo.get(i) + ", ");
			} else if (i == max - 1) {
				System.out.print(listTwo.get(i) + "]");
			}
		}
	}
}