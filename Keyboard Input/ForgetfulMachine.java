
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/the-forgetful-machine.html
 * Completed: December 21, 2016
 */

import java.util.Scanner;

public class ForgetfulMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Give me a word!");
		String wordFirst = sc.nextLine();
		System.out.println();

		System.out.println("Give me a second word!");
		String wordSecond = sc.nextLine();
		System.out.println();

		System.out.println("Great, now what is your favorite number?");
		int favoriteFirstNumber = sc.nextInt();
		System.out.println();

		System.out.println("What is your second-favorite number?");
		int favoriteSecondNumber = sc.nextInt();
		sc.close();

		System.out.println();
		System.out.println("Whew! Wasn't that fun?");
		System.out.println();
		System.out.println("You gave me a first word: '" + wordFirst + "', then a second word: '" + wordSecond + "'.");
		System.out.println("Your first favorite number is " + favoriteFirstNumber
				+ ", and your second favorite number is " + favoriteSecondNumber + ".");
	}
}