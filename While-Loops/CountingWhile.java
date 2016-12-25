
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/counting-while.html
 * Completed: December 25, 2016
 */

import java.util.Scanner;

public class CountingWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a messsage, and I'll display it five times.");
		System.out.print("Message: ");
		String message = sc.nextLine();
		System.out.print("How many times? ");
		int repetition = sc.nextInt();
		sc.close();

		int counter = 10;
		System.out.println();
		while (counter / 10 != (repetition + 1)) {
			System.out.println(counter + ". " + message + ".");
			counter += 10;
		}
	}
}