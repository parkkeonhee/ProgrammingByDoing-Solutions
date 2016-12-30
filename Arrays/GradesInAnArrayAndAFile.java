
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/grades-in-an-array-and-a-file.html
 * Completed: December 30, 2016
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GradesInAnArrayAndAFile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		System.out.print("Name (First, Last): ");
		String fullName = sc.nextLine();
		System.out.print("File name: ");
		String fileName = sc.nextLine();
		sc.close();

		File file = new File(fileName);

		file.createNewFile();

		FileWriter writer = new FileWriter(file);

		int[] grades = new int[5];

		System.out.println("\nHere are your randomly-selected grades (hope you pass):");
		writer.write(fullName + "\n");
		for (int i = 0; i < grades.length; i++) {
			grades[i] = generator.nextInt(100) + 1;
			System.out.println("Grade " + (i + 1) + ": " + grades[i] + ".");
			if (i != grades.length) {
				writer.write(grades[i] + " ");
			} else if (i == grades.length) {
				writer.write(grades[i]);
			}
		}
		writer.flush();
		writer.close();

		System.out.println("\nData saved in \"" + fileName + "\".");
	}
}