
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/do-while-swimming.html
 * Completed: December 27, 2016
 */

import java.util.Scanner;

public class DoWhileSwimming {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double minimumTemperature = 79.0;
		System.out.print("What is the current water temperature? ");
		double temperature = sc.nextDouble();
		sc.nextLine();
		sc.close();

		final double originalTemperature = temperature;

		boolean finished = false;
		boolean innerCompleted = false;
		String playerOne = "GALLANT";
		String playerTwo = "GOOFUS";
		String currentPlayer = "";
		int time = 0;
		int i = 1;
		do {
			if (i % 2 != 0) {
				currentPlayer = playerOne;
			} else if (i % 2 == 0) {
				currentPlayer = playerTwo;
				finished = true;
			}

			System.out.println("\nOkay, so the current water temperature is " + temperature + "F.");
			System.out.println(currentPlayer + " approaches the lake...");
			while (!innerCompleted) {
				if (temperature >= minimumTemperature) {
					temperature -= 0.5;
					time++;
					System.out.println("\t" + currentPlayer + " swims for a bit. Swim time: " + time + " min.");
					System.out.println("\tThe current water temperature is now " + temperature + "F.");
				} else {
					innerCompleted = true;
					System.out.println(currentPlayer + " stops swimming.");
					System.out.println("Total swim time: " + time + " min.");
				}
			}
			time = 0;
			innerCompleted = false;
			temperature = originalTemperature;
			i++;
		} while (!finished);
	}
}