
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/a-little-puzzle.html
 * Completed: December 31, 2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LittlePuzzle {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.print("Open which file: ");
		String fileName = sc.nextLine();
		sc.close();
		System.out.println();
		File file = new File(fileName);
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String line = "";
		String text = "";
		while ((line = reader.readLine()) != null) {
			text += line;
		}
		reader.close();
		for (int i = 0; i < text.length(); i++) {
			if ((i + 1) % 3 == 0) {
				System.out.print(text.charAt(i));
			}
		}
	}
}