
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/letter-at-a-time.html
 * Completed: December 29, 2016
 */

import java.util.Scanner;

public class LetterAtATime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your message? ");
		String message = sc.nextLine().trim();
		sc.close();
		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0, and is '" + message.charAt(0) + "'.");
		System.out.println("The last character is at position " + (message.length() - 1) + " and is '"
				+ message.charAt(message.length() - 1) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		int value_a = 0;
		int value_A = 0;
		int value_e = 0;
		int value_E = 0;
		int value_i = 0;
		int value_I = 0;
		int value_o = 0;
		int value_O = 0;
		int value_u = 0;
		int value_U = 0;
		for (int i = 0; i < message.length(); i++) {
			System.out.println("\t" + i + "- '" + message.charAt(i) + "'");
			if (message.charAt(i) == 'A') {
				value_A++;
			} else if (message.charAt(i) == 'E') {
				value_E++;
			} else if (message.charAt(i) == 'I') {
				value_I++;
			} else if (message.charAt(i) == 'O') {
				value_O++;
			} else if (message.charAt(i) == 'U') {
				value_U++;
			} else if (message.charAt(i) == 'a') {
				value_a++;
			} else if (message.charAt(i) == 'e') {
				value_e++;
			} else if (message.charAt(i) == 'i') {
				value_i++;
			} else if (message.charAt(i) == 'o') {
				value_o++;
			} else if (message.charAt(i) == 'u') {
				value_u++;
			}
		}
		System.out.println("\nYour message contains the letter 'A' " + value_A + " times.");
		System.out.println("Your message contains the letter 'E' " + value_E + " times.");
		System.out.println("Your message contains the letter 'I' " + value_I + " times.");
		System.out.println("Your message contains the letter 'O' " + value_O + " times.");
		System.out.println("Your message contains the letter 'U' " + value_U + " times.\n");
		System.out.println("Your message contains the letter 'a' " + value_a + " times.");
		System.out.println("Your message contains the letter 'e' " + value_e + " times.");
		System.out.println("Your message contains the letter 'i' " + value_i + " times.");
		System.out.println("Your message contains the letter 'o' " + value_o + " times.");
		System.out.println("Your message contains the letter 'u' " + value_u + " times.");
	}
}