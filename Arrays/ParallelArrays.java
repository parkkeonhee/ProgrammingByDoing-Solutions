
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/parallel-arrays.html
 * Completed: November 18, 2016
 */

import java.util.Scanner;

public class ParallelArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
		double[] grades = { 99.5, 78.5, 95.6, 96.8, 82.7 };
		int[] studentID = { 123456, 813225, 823669, 307760, 827131 };

		System.out.println("Values:");

		for (int i = 0; i < names.length; i++) {
			System.out.println("\t" + names[i] + " " + grades[i] + " " + studentID[i]);
		}
		System.out.println();

		System.out.print("ID number to find: ");
		int findID = sc.nextInt();
		sc.close();

		System.out.println();

		for (int i = 0; i < studentID.length; i++) {
			if (findID == studentID[i]) {
				System.out.println("Found in slot " + i);
				System.out.println("\tName: " + names[i]);
				System.out.println("\tAverage: " + grades[i]);
				System.out.println("\tID: " + studentID[i]);
			}
		}
	}
}