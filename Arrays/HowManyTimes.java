
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/how-many-times.html
 * Completed: December 30, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {
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

		int counter = 0;
		for (int i : array) {
			if (i == findValue) {
				counter++;
			}
		}
		if (counter == 1) {
			System.out.println("\n" + findValue + " was found " + counter + " time.");
		} else if (counter != 1) {
			System.out.println("\n" + findValue + " was found " + counter + " times.");
		}
	}
}