
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-records.html
 * Completed: December 22, 2016
 */

import java.util.Scanner;

public class BasicRecords {
	String name;
	int grade;
	double average;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BasicRecords recordOne = new BasicRecords();

		System.out.print("Enter the first student's name: ");
		recordOne.name = sc.nextLine();

		System.out.print("Enter the first student's grade: ");
		recordOne.grade = sc.nextInt();

		System.out.print("Enter the first student's average: ");
		recordOne.average = sc.nextDouble();
		sc.nextLine();

		System.out.println();

		BasicRecords recordTwo = new BasicRecords();

		System.out.print("Enter the second student's name: ");
		recordTwo.name = sc.nextLine();

		System.out.print("Enter the second student's grade: ");
		recordTwo.grade = sc.nextInt();

		System.out.print("Enter the second student's average: ");
		recordTwo.average = sc.nextDouble();
		sc.nextLine();

		System.out.println();
		BasicRecords recordThree = new BasicRecords();

		System.out.print("Enter the third student's name: ");
		recordThree.name = sc.nextLine();
		System.out.print("Enter the third student's grade: ");
		recordThree.grade = sc.nextInt();
		System.out.print("Enter the third student's average: ");
		recordThree.average = sc.nextDouble();
		sc.nextLine();
		sc.close();

		System.out.println();
		System.out.println(
				"The names are: " + recordOne.name + ", " + recordTwo.name + ", and " + recordThree.name + ".");
		System.out.println(
				"The grades are: " + recordOne.grade + ", " + recordTwo.grade + ", and " + recordThree.grade + ".");
		System.out.println("The averages are: " + recordOne.average + ", " + recordTwo.average + ", and "
				+ recordThree.average + ".");

		System.out.println();
		System.out.println("The average for the three students is: "
				+ ((recordOne.average + recordTwo.average + recordThree.average) / 3));
	}
}