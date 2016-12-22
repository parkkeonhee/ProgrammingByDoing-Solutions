
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/space-boxing.html
 * Completed: December 22, 2016
 */

import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] planet = { "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
		double[] weight = { 0.78, 0.39, 2.65, 1.17, 1.05, 1.23 };

		System.out.print("Please enter your current earth weight: ");
		double earthWeight = sc.nextDouble();
		System.out.println();
		System.out.println("I have information for the following planets: ");
		for (int i = 0; i < planet.length; i++) {
			if (i == 3) {
				System.out.println();
			} else if (i == 2) {
				System.out.print("\t");
			}
			System.out.print("\t" + (i + 1) + ". " + planet[i]);
		}

		System.out.println();
		System.out.print("Which planet are you visitng? ");
		int planetVisit = sc.nextInt();
		sc.close();
		System.out.println();

		double planetWeight = earthWeight * weight[planetVisit - 1];
		System.out.println("Your weight would be " + planetWeight + " pounds on that planet.");
	}
}