
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/counting-machine-revisited.html
 * Completed: December 29, 2016
 */

import java.util.Scanner;

public class CountingMachineRevisited {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count from: ");
		int countFrom = sc.nextInt();
		sc.nextLine();
		System.out.print("Count to  : ");
		int countTo = sc.nextInt();
		sc.nextLine();
		System.out.print("Count by  : ");
		int countBy = sc.nextInt();
		sc.nextLine();
		sc.close();
		System.out.println();

		for (int i = countFrom; i <= countTo; i += countBy) {
			if (i != countTo) {
				System.out.print(i + " ");
			} else if (i == countTo) {
				System.out.print(i);
			}
		}
	}
}