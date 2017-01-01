
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/displaying-a-file.html
 * Completed: December 31, 2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayingAFile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Open which file: ");
		String fileName = sc.nextLine();
		sc.close();

		File file = new File(fileName);

		BufferedReader reader = new BufferedReader(new FileReader(file));

		ArrayList<String> listString = new ArrayList<String>();
		String line = "";
		while ((line = reader.readLine()) != null) {
			listString.add(line);
		}
		reader.close();
		for (String i : listString) {
			System.out.println(i);
		}
	}
}