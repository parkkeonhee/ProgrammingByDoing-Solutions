
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/displaying-some-multiples.html
 * Completed: December 29, 2016
 */

import java.util.Scanner;

public class DisplayingSomeMultiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose a number: ");
		int number = sc.nextInt();
		sc.close();

		System.out.println();
		for (int i = 1; i <= 12; i++) {
			System.out.print(number + "x" + i + " = " + (number * i) + "\n");
		}
	}
}