
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/collatz-sequence.html
 * Completed: December 27, 2016
 */

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Starting number: ");
		int number = sc.nextInt();
		sc.close();

		if (number != 1) {
			System.out.print(number + "\t");
		} else {
			System.out.print(number);
		}

		int largestValue = number;
		int counter = 0;
		while (number != 1) {
			counter++;
			if (counter % 10 == 0) {
				System.out.println();
			}
			if (number % 2 == 0) {
				number /= 2;
			} else if (number % 2 == 1) {
				number = (number * 3) + 1;
			}

			if (number != 1) {
				System.out.print(number + "\t");
			} else {
				System.out.print(number);
			}

			if (largestValue < number) {
				largestValue = number;
			}
		}
		System.out.println("\n\nTerminated after " + counter + " steps. The largest value was " + largestValue + ".");
	}
}