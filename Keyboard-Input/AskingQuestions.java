
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/asking-questions.html
 * Completed: December 21, 2016
 */

import java.util.Scanner;

public class AskingQuestions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How old are you? ");
		int age = sc.nextInt();

		System.out.print("How many feet tall are you? ");
		int heightFeet = sc.nextInt();

		System.out.print("And how many inches? ");
		int heightInches = sc.nextInt();

		System.out.print("How much do you weigh? ");
		int weight = sc.nextInt();
		sc.close();

		System.out.println(
				"So, you're " + age + " old, " + heightFeet + "'" + heightInches + "\" tall and " + weight + " heavy.");
	}
}