
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/is-it-there-or-not.html
 * Completed: November 18, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
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
		System.out.println();
		sc.close();

		boolean notThere = false;
		for (int i : array) {
			if (findValue == i) {
				notThere = true;
			}
		}

		if (notThere) {
			System.out.println(findValue + " is in the array.");
		} else {
			System.out.println(findValue + " is not in the array.");
		}
	}
}