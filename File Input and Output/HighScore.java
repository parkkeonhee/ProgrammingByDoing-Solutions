
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/high-score.html
 * Completed: December 31, 2016
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String fileName = "score.txt";
		File score = new File(fileName);
		FileWriter writer = new FileWriter(score);

		System.out.println("You got a high score!");
		System.out.print("\nPlease enter your score: ");
		int userScore = sc.nextInt();
		sc.nextLine();

		System.out.print("Please enter your name: ");
		String userName = sc.nextLine();
		sc.close();

		try {
			writer.write("Username: " + userName + ".\n");
			writer.write("Score: " + userScore + ".");
			System.out.println("\nData stored into " + fileName + ".");
		} catch (Exception e) {
			System.out.println("Error occurred!");
		} finally {
			writer.flush();
			writer.close();
		}
	}
}