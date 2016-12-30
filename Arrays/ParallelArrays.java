
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/parallel-arrays.html
 * Completed: December 30, 2016
 */

import java.util.Scanner;

public class ParallelArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lastName = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
		double[] gradeAverage = { 99.5, 78.5, 95.6, 96.8, 82.7 };
		int[] studentId = { 123456, 813225, 823669, 307760, 827131 };

		System.out.println("Values:");
		for (int i = 0; i < lastName.length; i++) {
			System.out.println("\t" + lastName[i] + " " + gradeAverage[i] + " " + studentId[i]);
		}
		System.out.println();
		System.out.print("ID number to find: ");
		int findId = sc.nextInt();
		sc.nextLine();
		sc.close();

		boolean found = false;
		for (int i = 0; i < studentId.length; i++) {
			if (findId == studentId[i]) {
				System.out.println("\nFound in slot " + i + ".");
				System.out.println("\tName: " + lastName[i]);
				System.out.println("\tAverage: " + gradeAverage[i]);
				System.out.println("\tID: " + studentId[i]);
				found = true;
			}
		}
		if (!found) {
			System.out.println("\nThe ID number, " + findId + ", could not be found.");
		}
	}
}
