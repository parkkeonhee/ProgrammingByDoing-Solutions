
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/more-user-input-of-data.html
 * Completed: December 21, 2016
 */

import java.util.Scanner;

public class MoreUserInputOfData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the following information so I can sell it for profit!");
		System.out.println();

		System.out.print("First name: ");
		String nameFirst = sc.nextLine();

		System.out.print("Last name: ");
		String nameLast = sc.nextLine();

		System.out.print("Grade (9-12): ");
		int schoolGrade = sc.nextInt();

		System.out.print("Student ID: ");
		int studentId = sc.nextInt();
		sc.nextLine();

		System.out.print("Login: ");
		String username = sc.nextLine();

		System.out.print("GPA (0.0 - 4.0): ");
		double GPA = sc.nextDouble();
		sc.nextLine();
		sc.close();

		System.out.println();
		System.out.println("Your information:");
		System.out.println("\tLogin:\t" + username);
		System.out.println("\tID:\t" + studentId);
		System.out.println("\tName:\t" + nameLast + ", " + nameFirst);
		System.out.println("\tGPA:\t" + GPA);
		System.out.println("\tGrade:\t" + schoolGrade);
	}
}