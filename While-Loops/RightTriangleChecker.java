
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/right-triangle-checker.html
 * Completed: December 27, 2016
 */

import java.util.Scanner;

public class RightTriangleChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integers.");

		System.out.print("Side 1: ");
		int sideOne = sc.nextInt();
		System.out.print("Side 2: ");
		int sideTwo = sc.nextInt();

		while (sideOne >= sideTwo) {
			System.out.println(sideTwo + " is smaller than or equal to " + sideOne + ". Try again.");
			System.out.print("Side 2: ");
			sideTwo = sc.nextInt();
		}

		System.out.print("Side 3: ");
		int sideThree = sc.nextInt();
		while (sideOne >= sideThree || sideTwo >= sideThree) {
			if (sideOne >= sideThree) {
				System.out.println(sideThree + " is smaller than or equal to " + sideOne + ". Try again.");
				System.out.print("Side 3: ");
				sideThree = sc.nextInt();
			} else if (sideTwo >= sideThree) {
				System.out.println(sideThree + " is smaller than or equal to " + sideTwo + ". Try again.");
				System.out.print("Side 3: ");
				sideThree = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("\nYour three sides are " + sideOne + ", " + sideTwo + ", " + "and " + sideThree + ".");

		System.out.print("The result is: ");
		if (Math.pow(sideThree, 2) == Math.pow(sideOne, 2) + Math.pow(sideTwo, 2)) {
			System.out.print("Yes, they do make a right triangle!");
		} else {
			System.out.print("No, they do not make a right triangle!");
		}
	}
}