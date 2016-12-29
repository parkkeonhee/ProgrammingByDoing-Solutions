
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/how-old-are-you.html
 * Completed: December 22, 2016
 */

import java.util.Scanner;

public class HowOldAreYou {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hey, what is your name? ");
		String name = sc.nextLine();

		System.out.print("Ok, " + name + ", how old are you? ");
		int age = sc.nextInt();
		sc.close();

		if (age < 16) {
			System.out.println("You can't drive, " + name + ".");
		}
		if (age < 18) {
			System.out.println("You can't vote, " + name + ".");
		}
		if (age < 25) {
			System.out.println("You can't rent a car, " + name + ".");
		}
		if (age >= 25) {
			System.out.println("You can do anything that is legal, " + name + ".");
		}
	}
}