
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/counting-machine.html
 * Completed: November 13, 2016
 */
import java.util.Scanner;

public class CountingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count to: ");
		int max = sc.nextInt();
		for (int i = 0; i <= max; i++) {
			if (i != max) {
				System.out.print(i + " ");
			} else {
				System.out.print(i);
			}
		}
		sc.close();
	}
}