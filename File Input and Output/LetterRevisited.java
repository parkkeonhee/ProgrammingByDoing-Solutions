
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/letter-revisited.html
 * Completed: December 31, 2016
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LetterRevisited {

	public static void main(String[] args) throws IOException {
		File letter = new File("letter.txt");
		letter.createNewFile();
		FileWriter writer = new FileWriter(letter);

		writer.write("+---------------------------------------------------------+\n");
		for (int i = 0; i < 3; i++) {
			writer.write("|                                                    #### |\n");
		}
		for (int i = 0; i < 2; i++) {
			writer.write("|                                                         |\n");
		}
		writer.write("|                              Bill Gates                 |\n");
		writer.write("|                              1 Microsoft Way            |\n");
		writer.write("|                              Redmond, WA 98104          |\n");
		writer.write("|                                                         |\n");
		writer.write("+---------------------------------------------------------+");
		writer.flush();
		writer.close();
	}
}