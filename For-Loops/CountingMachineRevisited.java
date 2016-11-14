
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/counting-machine-revisited.html
 * Completed: November 13, 2016
 */
import java.util.Scanner;

public class CountingMachineRevisited {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count from: ");
		int fromInput = sc.nextInt();
		System.out.print("Count to: ");
		int to = sc.nextInt();
		System.out.print("Count by: ");
		int by = sc.nextInt();
		sc.close();

		System.out.println();
		for (int from = fromInput; from <= to; from = from + by) {
			if (from != to) {
				System.out.print(from + " ");
			} else {
				System.out.print(from);
			}
		}
	}
}