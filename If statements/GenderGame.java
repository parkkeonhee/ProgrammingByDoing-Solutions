
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/gender-game.html
 * Completed: December 24, 2016
 */

import java.util.Scanner;

public class GenderGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your gender (M or F): ");
		String gender = sc.nextLine();

		System.out.print("First name: ");
		String nameFirst = sc.nextLine();

		System.out.print("Last name: ");
		String nameLast = sc.nextLine();

		System.out.print("Age: ");
		int age = sc.nextInt();
		sc.nextLine();

		if (age >= 20) {
			if (gender.equalsIgnoreCase("f")) {
				System.out.print("\nAre you married, " + nameFirst + " (y or n)? ");
				String maritalStatus = sc.nextLine();
				sc.close();
				if (maritalStatus.equalsIgnoreCase("y")) {
					System.out.print("\nThen I shall call you, Mrs. " + nameLast + ".");
				} else {
					System.out.print("\nThen I shall call you, Ms. " + nameLast + ".");
				}
			} else {
				System.out.print("\nThen I shall call you, Mr. " + nameLast + ".");
			}
		} else {
			System.out.print("\nThen I shall call you, " + nameFirst + " " + nameLast + ".");
		}
	}
}