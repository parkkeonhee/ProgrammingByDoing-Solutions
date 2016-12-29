
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/noticing-even-numbers.html
 * Completed: December 29, 2016
 */

public class NoticingEvenNumbers {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " <");
			} else if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}