
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/finding-a-value-in-an-array.html
 * Completed: December 30, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArray {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = generator.nextInt(50) + 1;
			if (i == 0) {
				System.out.print("Array: ");
			}
			if (i != array.length) {
				System.out.print(array[i] + " ");
			} else if (i == array.length) {
				System.out.print(array[i]);
			}
		}

		System.out.print("\nValue to find: ");
		int findValue = sc.nextInt();
		sc.nextLine();
		sc.close();

		System.out.println();
		boolean found = false;
		for (int i : array) {
			if (findValue == i) {
				found = true;
				System.out.println(findValue + " is in the array.");
			}
		}
		if (!found) {
			System.out.println(findValue + " is not in the array.");
		}
	}
}
