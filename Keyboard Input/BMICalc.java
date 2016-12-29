
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/bmi-calculator.html
 * Completed: December 21, 2016
 */

import java.util.Scanner;

public class BMICalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your height (feet only): ");
		double heightFeet = sc.nextDouble();
		double heightMeters = heightFeet * 0.3048;

		System.out.print("Your height in inches: ");
		double heightInches = sc.nextDouble();
		heightMeters = heightMeters + (heightInches * 0.0254);

		System.out.print("Your weight in pounds: ");
		double weightPounds = sc.nextDouble();
		double weightKg = weightPounds * 0.453592;
		sc.close();

		double bmi = weightKg / Math.pow(heightMeters, 2);

		System.out.println();
		System.out.println("Your BMI is " + bmi + ".");
	}
}