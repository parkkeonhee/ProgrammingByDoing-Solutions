
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/finding-a-value-in-an-array.html
 * Completed: November 18, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArray {
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

		for (int i = 0; i < array.length; i++) {
			if (findValue == array[i]) {
				System.out.println(findValue + " is in the array.");
			}
		}
	}
}