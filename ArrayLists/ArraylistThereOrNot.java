
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/arraylist-there-or-not.html
 * Completed: December 30, 2016
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraylistThereOrNot {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		int max = 10;
		for (int i = 0; i < max; i++) {
			list.add(generator.nextInt(50) + 1);
			if (i == 0) {
				System.out.print("ArrayList: [" + list.get(i) + ", ");
			} else if (i != 0 && i != max - 1) {
				System.out.print(list.get(i) + ", ");
			} else if (i == max - 1) {
				System.out.print(list.get(i) + "]");
			}
		}
		System.out.println();
		System.out.print("Value to find: ");
		int findValue = sc.nextInt();
		sc.nextLine();
		sc.close();

		System.out.println();
		boolean found = false;
		for (int i : list) {
			if (i == findValue) {
				System.out.println(findValue + " is in the ArrayList.");
				found = true;
			}
		}
		if (!found) {
			System.out.println(findValue + " is not in the ArrayList.");
		}
	}
}