
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/sorting-sentences.html
 * Completed: December 31, 2016
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingSentences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sentence: ");
		String sentence = sc.nextLine();
		sc.close();

		String[] sentenceSplitArray = sentence.toLowerCase().split(" ");

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(sentenceSplitArray));
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				System.out.print("Sorted: [" + list.get(i) + ", ");
			} else if (i != 0 && i != list.size() - 1) {
				System.out.print(list.get(i) + ", ");
			} else if (i == list.size() - 1) {
				System.out.print(list.get(i) + "]");
			}
		}
	}
}
