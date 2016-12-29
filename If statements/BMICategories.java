
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/bmi-categories.html
 * Completed: December 24, 2016
 */

import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args) {
		final double poundsToKg = 0.453592;
		final double inchesToMeters = 0.0254;

		Scanner sc = new Scanner(System.in);
		System.out.print("Your height in inches: ");
		double heightInches = sc.nextDouble();
		System.out.print("Your weight in pounds: ");
		double weightPounds = sc.nextDouble();
		sc.close();
		double bmi = (weightPounds * poundsToKg) / Math.pow((heightInches * inchesToMeters), 2);

		System.out.println("\nYour BMI is " + bmi);
		System.out.print("BMI Category: ");
		if (bmi < 15.0) {
			System.out.print("Very severely underweight.");
		} else if (bmi <= 16.0 && bmi >= 15.0) {
			System.out.print("Severely underweight.");
		} else if (bmi <= 18.4 && bmi >= 16.1) {
			System.out.print("Underweight.");
		} else if (bmi < 24.9 && bmi >= 18.5) {
			System.out.print("Normal weight.");
		} else if (bmi <= 29.9 && bmi >= 25.0) {
			System.out.print("Overweight.");
		} else if (bmi <= 34.9 && bmi >= 30.0) {
			System.out.print("Moderately obese.");
		} else if (bmi <= 39.9 && bmi >= 35.0) {
			System.out.print("Severely obese.");
		} else if (bmi >= 40.0) {
			System.out.print("Very severely or morbidly obese.");
		}
	}
}