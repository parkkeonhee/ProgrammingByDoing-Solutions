
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/simple-file-input.html
 * Completed: December 31, 2016
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SimpleFileInput {
	public static void main(String[] args) throws IOException {
		String fileName = "name.txt";
		File file = new File(fileName);

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		ArrayList<String> list = new ArrayList<String>();
		while ((line = reader.readLine()) != null) {
			list.add(line);
		}
		reader.close();
		String name = "";
		for (String i : list) {
			name += i;
		}

		System.out.println("Your original name is " + name + " from " + fileName + " file.");
		name = "Horace Mann";

		FileWriter writer = new FileWriter(fileName);
		writer.write(name);
		writer.flush();
		writer.close();

		System.out.println("This program changed your name to " + name + ", and is already changed on your " + fileName
				+ " file.");
	}
}