
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/counting-for.html
 * Completed: November 13, 2016
 */
import java.util.Scanner;

public class CountingFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a message, and I'll display it ten times.");
		System.out.print("Message: ");
		String message = sc.nextLine();
		sc.close();

		for (int i = 0; i < 10; i += 2) {
			System.out.println((i + 2) + ". " + message);
		}
	}
}
