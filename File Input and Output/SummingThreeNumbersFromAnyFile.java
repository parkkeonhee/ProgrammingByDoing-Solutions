
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/summing-three-numbers-from-any-file.html
 * Completed: December 31, 2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SummingThreeNumbersFromAnyFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Which file would you like to read numbers from: ");
		String fileName = sc.nextLine();
		sc.close();

		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			System.out.println("Reading numbers from file \"" + fileName + "\".");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		ArrayList<String> listString = new ArrayList<String>();
		String lines = "";

		try {
			while ((lines = reader.readLine()) != null) {
				listString.add(lines);
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		ArrayList<Integer> listInteger = new ArrayList<Integer>();
		for (String i : listString) {
			listInteger.add(Integer.valueOf(i));
		}

		System.out.println();
		int total = 0;
		for (int i = 0; i < listInteger.size(); i++) {
			total += listInteger.get(i);
			if (i != listInteger.size() - 1) {
				System.out.print(listInteger.get(i) + " + ");
			} else if (i == listInteger.size() - 1) {
				System.out.print(listInteger.get(i) + " = ");
			}
		}

		System.out.print(total);

	}
}