
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/safe-square-root.html
 * Completed: December 27, 2016
 */

import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Square Root!");
		System.out.print("Enter a number: ");
		double number = sc.nextDouble();

		while (number < 0) {
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.print("Try again: ");
			number = sc.nextDouble();
		}
		sc.close();
		System.out.println("The square root of " + number + " is " + Math.sqrt(number) + ".");
	}
}