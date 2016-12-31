
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/arraylist-where-is-it.html
 * Completed: December 30, 2016
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraylistWhereIsIt {
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
		System.out.print("\nValue to find: ");
		int findValue = sc.nextInt();
		sc.nextLine();
		sc.close();

		System.out.println();
		boolean found = false;
		for (int i = 0; i < max; i++) {
			if (list.get(i) == findValue) {
				System.out.println(findValue + " is in slot " + i + ".");
				found = true;
			}
		}
		if (!found) {
			System.out.println(findValue + " is not in the ArrayList.");
		}
	}
}