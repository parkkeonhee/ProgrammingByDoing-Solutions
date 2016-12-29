
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/age-messages-3.html
 * Completed: December 24, 2016
 */

import java.util.Scanner;

public class AgeMessages3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your name: ");
		String name = sc.nextLine();

		System.out.print("Your age: ");
		int age = sc.nextInt();
		sc.close();

		System.out.println();
		if (age < 16) {
			System.out.println("You can't drive, " + name + ".");
		}
		if (age <= 17 && age >= 16) {
			System.out.println("You can drive but not voite, " + name + ".");
		}
		if (age <= 24 && age >= 18) {
			System.out.println("You can vote but not rent a car, " + name + ".");
		}
		if (age >= 25) {
			System.out.println("You can do pretty much anything, " + name + ".");
		}
	}
}