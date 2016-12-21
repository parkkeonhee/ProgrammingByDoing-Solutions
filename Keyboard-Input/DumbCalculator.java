
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/a-dumb-calculator.html
 * Completed: December 21, 2016
 */

import java.util.Scanner;

public class DumbCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first number? ");
		double numberFirst = sc.nextDouble();

		System.out.print("What is your second number? ");
		double numberSecond = sc.nextDouble();

		System.out.print("What is your third number? ");
		double numberThird = sc.nextDouble();
		sc.close();

		System.out.println();
		System.out.println("( " + numberFirst + " + " + numberSecond + " + " + numberThird + " ) / 2 is... "
				+ (numberFirst + numberSecond + numberThird) / 2);

	}
}