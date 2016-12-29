
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/adding-values-in-a-loop.html
 * Completed: December 25, 2016
 */

import java.util.Scanner;

public class AddingValuesInALoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("I will add up the numbers you give me.");
		System.out.println("The program will stop at value 0.\n");

		System.out.print("Number: ");
		double addNumber = sc.nextDouble();

		double totalNumber = 0;
		while (addNumber != 0) {
			totalNumber += addNumber;
			System.out.println("\nThe total so far: " + totalNumber + ".");
			System.out.print("Number: ");
			addNumber = sc.nextDouble();
		}
		sc.close();
		System.out.println("\nThe total is: " + totalNumber + ".");
	}
}