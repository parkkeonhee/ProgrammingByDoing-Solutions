
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/twenty-questions.html
 * Completed: December 22, 2016
 */

import java.util.Scanner;

public class TwentyQuestions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Two Questions!");
		System.out.println("Think of an object, and I'll try to guess it.");

		System.out.println();
		System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
		System.out.print("Your answer: ");
		String answerFirst = sc.nextLine();

		System.out.println("\nQuestion 2) Is it bigger than a breadbox?");
		System.out.print("Your answer: ");
		String answerSecond = sc.nextLine();
		sc.close();

		System.out.println();
		String answer = "";
		if (answerFirst.equalsIgnoreCase("animal")) {
			if (answerSecond.equalsIgnoreCase("yes")) {
				answer = "squirrel";
			} else {
				answer = "moose";
			}
		} else if (answerFirst.equalsIgnoreCase("vegetable")) {
			if (answerSecond.equalsIgnoreCase("yes")) {
				answer = "carrot";
			} else {
				answer = "watermelon";
			}
		} else {
			if (answerSecond.equalsIgnoreCase("yes")) {
				answer = "paper clip";
			} else {
				answer = "Camaro";
			}
		}
		System.out.println("My guess is that you are thinking of a " + answer + ".");
		System.out.println("I would ask you if I'm right, but I don't actually care.");
	}
}