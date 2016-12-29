
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/a-refresher.html
 * Completed: December 29, 2016
 */

import java.util.Scanner;

public class Refresher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name: ");
		String message = sc.nextLine();
		sc.close();
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (message.equalsIgnoreCase("mitchell")) {
				i++;
			}
			System.out.println(message);
		}
	}
}