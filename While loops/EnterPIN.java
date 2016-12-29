
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/bmi-categories.html
 * Completed: December 25, 2016
 */

import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Bank of Mitchell.");
		System.out.print("Enter your PIN: ");
		int promptPIN = sc.nextInt();
		sc.nextLine();

		while (promptPIN != 12345) {
			System.out.println("\nIncorrect PIN. Try Again.");
			System.out.print("Enter your PIN: ");
			promptPIN = sc.nextInt();
			sc.nextLine();
		}
		sc.close();

		System.out.println("\nPIN Accepted. You now have access to your account.");
	}
}