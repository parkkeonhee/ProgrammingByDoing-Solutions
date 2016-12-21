
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/name-age-and-salary.html
 * Completed: December 21, 2016
 */

import java.util.Scanner;

public class NameAgeAndSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello! What is your name?");
		String name = sc.nextLine();
		System.out.println();

		System.out.println("Hi, " + name + "! How old are you?");
		int age = sc.nextInt();
		System.out.println();

		System.out.println("So, you are " + age + ", eh? That's not old at all!");
		System.out.println("How much do you make, " + name + "?");
		double wage = sc.nextDouble();
		sc.close();
		
		System.out.println();
		System.out.println("$" + wage + "! I hope that's per hour and not per year! LOL!");
	}
}