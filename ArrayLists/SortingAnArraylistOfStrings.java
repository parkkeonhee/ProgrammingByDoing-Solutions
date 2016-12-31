
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/sorting-an-arraylist-of-strings.html
 * Completed: December 30, 2016
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingAnArraylistOfStrings {
	public static void main(String[] args) {
		ArrayList<String> listOne = new ArrayList<String>(
				Arrays.asList("ask", "not", "what", "your", "country", "can", "do", "for", "you", "but"));

		int max = listOne.size();
		for (int i = 0; i < max; i++) {
			if (i == 0) {
				System.out.print("ArrayList before: [" + listOne.get(i) + ", ");
			} else if (i != 0 && i != max - 1) {
				System.out.print(listOne.get(i) + ", ");
			} else if (i == max - 1) {
				System.out.print(listOne.get(i) + "]");
			}
		}

		ArrayList<String> listTwo = new ArrayList<String>(listOne);
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