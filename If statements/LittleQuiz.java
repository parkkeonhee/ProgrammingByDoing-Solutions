
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/a-little-quiz.html
 * Completed: December 22, 2016
 */

import java.util.Scanner;

public class LittleQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Are you ready for a quiz? ");
		sc.nextLine();
		System.out.println("Okay, here it comes!");

		System.out.println();
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("\t1) Melbourne");
		System.out.println("\t2) Anchorage");
		System.out.println("\t3) Juneau");

		System.out.print("\nYour answer: ");
		int answerFirst = sc.nextInt();

		System.out.println();
		int counter = 0;
		if (answerFirst == 3) {
			System.out.println("Correct!");
			counter++;
		} else {
			System.out.println("Sorry, the answer was 2) Anchorage");
		}

		System.out.println();
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("\t1) Yes");
		System.out.println("\t2) No");

		System.out.println();
		System.out.print("Your answer: ");
		int answerSecond = sc.nextInt();

		System.out.println();
		if (answerSecond == 2) {
			System.out.println("Correct!");
			counter++;
		} else {
			System.out.println(
					"Incorrect. The answer is 'No'. The \"cat\" is a string. An int can only store whole numbers.");
		}

		System.out.println();
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("\t1) 5");
		System.out.println("\t2) 11");
		System.out.println("\t3) 15/3");

		System.out.println();
		System.out.print("Your answer: ");
		int answerThird = sc.nextInt();
		sc.close();

		if (answerThird == 2) {
			System.out.println("Correct!");
			counter++;
		} else {
			System.out.println("Sorry, the answer is 2) 11.");
		}

		System.out.println("\nOverall, you got " + counter + " out of 3 correct.");
		System.out.println("Thanks for playing!");
	}
}