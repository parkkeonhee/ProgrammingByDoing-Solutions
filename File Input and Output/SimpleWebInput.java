
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/simple-web-input.html
 * Completed: December 31, 2016
 */

import java.net.URL;
import java.util.Scanner;

public class SimpleWebInput {
	public static void main(String[] args) throws Exception {
		URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
		Scanner webIn = new Scanner(mcool.openStream());

		String one = "";
		while (webIn.hasNextLine()) {
			one = webIn.nextLine();
			System.out.println(one);
		}
		webIn.close();
	}
}