
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/collatz-sequence.html
 * Completed: November 12, 2016
 */

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Starting number: ");
		number = sc.nextInt();
		System.out.print(number + "\t");

		int lineBreakCounter = 1;
		int numberOfSteps = 0;
		int largestValue = number;
		do {
			if (lineBreakCounter % 8 == 0) {
				System.out.println();
			}
			if (number % 2 == 0) {
				number /= 2;
				System.out.print(number + "\t");
				largestValue = (largestValue < number) ? number : largestValue;
				lineBreakCounter++;
				numberOfSteps++;
			} else {
				number = (number * 3) + 1;
				System.out.print(number + "\t");
				largestValue = (largestValue < number) ? number : largestValue;
				lineBreakCounter++;
				numberOfSteps++;
			}
		} while (number != 1);
		System.out.println();
		System.out.println();
		System.out.println("Terminated after " + numberOfSteps + " steps.");
		System.out.println("The largest value was " + largestValue + ".");
		sc.close();
	}
}