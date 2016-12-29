
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/for-loop-challenge.html
 * Completed: December 29, 2016
 */

public class ForLoopChallenge {
	public static void main(String[] args) {
		System.out.println("Write a for loop that makes the variable j go from 15 to 30, counting by 3s.");

		System.out.println();
		for (int i = 15; i <= 30; i += 3) {
			if (i != 30) {
				System.out.print(i + " ");
			} else if (i == 30) {
				System.out.print(i);
			}
		}
	}
}