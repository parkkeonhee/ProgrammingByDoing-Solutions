
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/right-triangle-checker.html
 * Completed: November 12, 2016
 */

import java.util.Scanner;

public class RightTriangleChecker {
	public static void main(String[] args) {
		int side1, side2, side3;
		boolean completed = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integers:");
		do {
			System.out.print("Side 1: ");
			side1 = sc.nextInt();
			System.out.print("Side 2: ");
			side2 = sc.nextInt();

			while (side2 < side1) {
				System.out.println(side2 + " is smaller than " + side1 + ". Try again.");
				System.out.print("Side 2: ");
				side2 = sc.nextInt();
			}

			System.out.print("Side 3: ");
			side3 = sc.nextInt();

			while (side3 < side2) {
				System.out.println(side3 + " is smaller than " + side2 + ". Try again.");
				System.out.print("Side 3: ");
				side3 = sc.nextInt();
			}

			System.out.println();
			System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);
			if (Math.pow(side3, 2) != (Math.pow(side1, 2) + Math.pow(side2, 2))) {
				System.out.println("NO! These sides do not make a right triangle!");
				System.out.println();
				System.out.println("Start all over!");
				System.out.println();
			} else {
				System.out.println("These sides *do* make a right triangle. Yippy-skippy!");
				completed = true;
			}
		} while (!completed);
		sc.close();
	}
}