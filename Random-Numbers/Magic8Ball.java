
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/magic-8ball.html
 * Completed: December 24, 2016
 */

import java.util.Random;

public class Magic8Ball {
	public static void main(String[] args) {
		Random generator = new Random();
		int magicNumber = generator.nextInt(20) + 1;

		System.out.print("MAGIC 8-BALL SAYS: ");
		switch (magicNumber) {
		case 1:
			System.out.print("It is certain.");
			break;
		case 2:
			System.out.print("It is decidedly so.");
			break;
		case 3:
			System.out.print("Without a doubt.");
			break;
		case 4:
			System.out.print("Yes - definitely.");
			break;
		case 5:
			System.out.print("You may rely on it.");
			break;
		case 6:
			System.out.print("As I see it, yes.");
			break;
		case 7:
			System.out.print("Most likely.");
			break;
		case 8:
			System.out.print("Outlook good.");
			break;
		case 9:
			System.out.print("Signs point to yes.");
			break;
		case 10:
			System.out.print("Yes");
			break;
		case 11:
			System.out.print("Reply hazy, try again.");
			break;
		case 12:
			System.out.print("Ask again later.");
			break;
		case 13:
			System.out.print("Better not tell you now.");
			break;
		case 14:
			System.out.print("Cannot predict now.");
			break;
		case 15:
			System.out.print("Concentrate and ask again.");
			break;
		case 16:
			System.out.print("Don't count on it.");
			break;
		case 17:
			System.out.print("My reply is no.");
			break;
		case 18:
			System.out.print("My sources say no.");
			break;
		case 19:
			System.out.print("Outlook not so good.");
			break;
		case 20:
			System.out.print("Very doubtful.");
		default:
			System.out.print("8-BALL ERROR!");
		}
	}
}