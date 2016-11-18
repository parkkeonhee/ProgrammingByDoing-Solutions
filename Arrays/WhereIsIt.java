
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/where-is-it.html
 * Completed: November 18, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("Array: ");
			}
			array[i] = generator.nextInt(50) + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("Value to find: ");
		int findValue = sc.nextInt();
		sc.close();
		System.out.println();

		boolean found = false;
		int index = 0;
		for (int i : array) {
			if (findValue == i) {
				System.out.println(findValue + " is in index " + index + ".");
				found = true;
			}
			index++;
		}
		if (!found) {
			System.out.println(findValue + " is not in the array.");
		}
	}
}