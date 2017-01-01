
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/vowel-capitalization.html
 * Completed: December 31, 2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class VowelCapitalization {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Open which file: ");
		String fileName = sc.nextLine();
		sc.close();
		File file = new File(fileName);
		BufferedReader reader = new BufferedReader(new FileReader(file));

		System.out.println();
		String line = "";

		while ((line = reader.readLine()) != null) {
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);

				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					System.out.print(Character.toUpperCase(c));
				} else
					System.out.print(c);
			}
			System.out.println();
		}
		reader.close();
	}
}