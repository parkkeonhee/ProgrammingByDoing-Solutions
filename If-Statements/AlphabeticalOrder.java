
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/alphabetical-order.html
 * Completed: December 24, 2016
 */

import java.util.Scanner;

public class AlphabeticalOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your last name? ");
		String nameLast = sc.nextLine();
		sc.close();

		if ("Carswell".compareToIgnoreCase(nameLast) >= 0) {
			System.out.println("You don't have to wait long, " + nameLast + ".");
		} else if ("Jones".compareToIgnoreCase(nameLast) >= 0) {
			System.out.println("That's not bad, " + nameLast + ".");
		} else if ("Smith".compareToIgnoreCase(nameLast) >= 0) {
			System.out.println("Looks like a bit of a wait, " + nameLast + ".");
		} else if ("Young".compareToIgnoreCase(nameLast) >= 0) {
			System.out.println("It's gonna be a while, " + nameLast + ".");
		} else if ("Young".compareToIgnoreCase(nameLast) <= 0) {
			System.out.println("Not going anywhere for a while, " + nameLast + ".");
		}
	}
}