
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/two-more-questions.html
 * Completed: December 24, 2016
 */

import java.util.Scanner;

public class TwoMoreQuestions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Two More Questions, Baby!");
		System.out.println("\nThink of something and I'll try to guess it!\n");

		System.out.print("Question 1) Does it stay inside or outside or both? ");
		String questionOne = sc.nextLine();

		System.out.print("Question 2) Is it a living thing? ");
		String questionTwo = sc.nextLine();
		sc.close();

		System.out.println();
		if (questionOne.equalsIgnoreCase("inside") && questionTwo.equalsIgnoreCase("yes")) {
			System.out.println("I am thinking of a houseplant.");
		}
		if (questionOne.equalsIgnoreCase("inside") && questionTwo.equalsIgnoreCase("no")) {
			System.out.println("I am thinking of a shower curtain.");
		}
		if (questionOne.equalsIgnoreCase("outside") && questionTwo.equalsIgnoreCase("yes")) {
			System.out.println("I am thinking of a bison.");
		}
		if (questionOne.equalsIgnoreCase("outside") && questionTwo.equalsIgnoreCase("no")) {
			System.out.println("I am thinking of a billboard.");
		}
		if (questionOne.equalsIgnoreCase("both") && questionTwo.equalsIgnoreCase("yes")) {
			System.out.println("I am thinking of a dog.");
		}
		if (questionOne.equalsIgnoreCase("both") && questionTwo.equalsIgnoreCase("no")) {
			System.out.println("I am thinking of a cell phone.");
		}
	}
}