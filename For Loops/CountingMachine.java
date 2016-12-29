
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/counting-machine.html
 * Completed: December 29, 2016
 */

import java.util.Scanner;

public class CountingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count to: ");
		int countTo = sc.nextInt();
		sc.close();

		for (int i = 0; i <= countTo; i++) {
			if (i != countTo) {
				System.out.print(i + " ");
			} else if (i == countTo) {
				System.out.print(i);
			}
		}
	}
}