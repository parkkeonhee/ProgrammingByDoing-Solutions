/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/do-while-swimming.html
 * Completed: November 12, 2016
 */

import java.util.Scanner;

public class DoWhileSwimming {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String[] swimmer = new String[] { "GALLANT", "GOOFUS"};
		final double minimumTemperature = 79.0;

		int swimTime = 0;
		boolean swimmerDone = false;
		boolean status = false;

		System.out.print("What is the current water temperature? ");
		double currentTemperature = sc.nextDouble();
		double initialTemperature = currentTemperature;

		int i = 0;
		boolean resetFirstTime = false;
		do {
			if (!resetFirstTime) {
				System.out.println();
				System.out.println("Okay, so the current water temperature is " + currentTemperature + "F.");
				System.out.println(swimmer[i] + " approaches the lake...");
				resetFirstTime = true;
				swimmerDone = false;
			}
			if (!swimmerDone) {
				System.out.println("\t" + swimmer[i] + " swims for a bit. Swim time: " + ++swimTime + " min.");
				currentTemperature -= 0.5;
				System.out.println("\t" + "The current water temperature is now " + currentTemperature + "F.");
				if (currentTemperature < minimumTemperature) {
					swimmerDone = true;
					System.out.println(swimmer[i] + " stops swimming. Total swim time: " + swimTime + " min.");
					status = i == swimmer.length - 1;
					i++;
					resetFirstTime = false;
					currentTemperature = initialTemperature;
					swimTime = 0;
				}
			}
		} while (!status);
		sc.close();
	}
}