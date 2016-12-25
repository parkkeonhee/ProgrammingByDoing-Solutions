
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/pin-lockout.html
 * Completed: December 25, 2016
 */

import java.util.Scanner;

public class PinLockout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Bank of Mitchell.");
		System.out.print("Enter your PIN: ");
		int userPrompt = sc.nextInt();

		int tries = 1;
		int maxTries = 4;
		while (userPrompt != 12345 && tries != maxTries) {
			System.out.println("\nIncorrect PIN. Try again.");
			System.out.print("Enter your PIN: ");
			userPrompt = sc.nextInt();
			tries++;
		}
		sc.close();

		if (tries >= 3) {
			System.out.println("\nYou have run out of tries. ACCOUNT LOCKED.");
		} else {
			System.out.println("\nYou can now access your bank account.");
		}
	}
}