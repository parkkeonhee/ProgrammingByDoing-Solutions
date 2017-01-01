
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/summing-several-numbers-from-any-file.html
 * Completed: December 31, 2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SummingSeveralNumbersFromAnyFile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = null;
		int total = 0;
		do {
			System.out.print("Which file would you like to read numbers from: ");
			String fileName = sc.nextLine();
			System.out.println("Reading numbers from \"" + fileName + "\".");
			System.out.println();

			File file = new File(fileName);

			reader = new BufferedReader(new FileReader(file));

			String line = "";
			ArrayList<String> listString = new ArrayList<String>();
			while ((line = reader.readLine()) != null) {
				listString.add(line);
			}

			Scanner scanNumber = new Scanner(listString.get(0));
			ArrayList<Integer> listInteger = new ArrayList<Integer>();
			while (scanNumber.hasNextInt()) {
				listInteger.add(scanNumber.nextInt());
			}
			scanNumber.close();

			for (int i : listInteger) {
				System.out.print(i + " ");
				total += i;
			}
			System.out.println("\nThe total is " + total + ".");

			System.out.print("\nWould you like to read a new file? ");
		} while (sc.nextLine().equalsIgnoreCase("yes"));
		sc.close();
		reader.close();
	}
}