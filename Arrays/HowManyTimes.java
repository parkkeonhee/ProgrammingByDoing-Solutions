
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/how-many-times.html
 * Completed: November 18, 2016
 */

import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		String response = "";

		do {
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
			sc.nextLine();

			int counter = 0;
			for (int k = 0; k < array.length; k++) {
				if (findValue == array[k]) {
					counter++;
				}
			}
			System.out.println(findValue + " was found " + counter + " times.");
			System.out.println("Do you want to play again? (Y/N)");
			response = sc.nextLine();
			System.out.println();
		} while (response.equalsIgnoreCase("Y"));
		sc.close();
	}
}