
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/summing-three-numbers-from-a-file.html
 * Completed: December 31, 2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SummingThreeNumbersFromAFile {
	public static void main(String[] args) throws IOException {
		String fileName = "3nums.txt";
		File file = new File(fileName);

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = "";
		ArrayList<String> listString = new ArrayList<String>();
		while ((line = reader.readLine()) != null) {
			listString.add(line);
		}
		reader.close();

		ArrayList<Integer> listInteger = new ArrayList<Integer>(listString.size());
		for (String i : listString) {
			listInteger.add(Integer.valueOf(i));
		}

		int total = 0;
		for (int i = 0; i < listInteger.size(); i++) {
			total += listInteger.get(i);
		}
		System.out.println(total);
	}
}