
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/adding-values-with-a-for-loop.html
 * Completed: December 29, 2016
 */

import java.util.Scanner;

public class AddingValuesForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		sc.close();
		System.out.println();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (i != number) {
				System.out.print(i + " ");
			} else {
				System.out.print(i);
			}
			sum += i;
		}
		System.out.println("\nThe sum is " + sum + ".");
	}
}