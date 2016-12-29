
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/fortune-cookie.html
 * Completed: December 24, 2016
 */

import java.util.Random;

public class FortuneCookie {
	public static void main(String[] args) {
		Random generator = new Random();
		System.out.print("Fortune cookie says: ");

		int cookieNumber = generator.nextInt(6) + 1;
		switch (cookieNumber) {
		case 1:
			System.out.print("Today is the day to show someone you care.");
			break;
		case 2:
			System.out.print("You can create your own happiness.");
			break;
		case 3:
			System.out.print("Mistakes happen. Turn them into opportunities.");
			break;
		case 4:
			System.out.print("It's not the destination; it's the journey.");
			break;
		case 5:
			System.out.print("Life's journey is always an adventure.");
			break;
		case 6:
			System.out.print("You won't know until you try.");
			break;
		default:
			System.err.print("ERROR!");
		}

		System.out.println();
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print("\t");
			}
			if (i != 5) {
				System.out.print((generator.nextInt(54) + 1) + " - ");
			} else {
				System.out.print(generator.nextInt(54) + 1);
			}
		}
	}
}