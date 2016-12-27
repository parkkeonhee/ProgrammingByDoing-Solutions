
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/baby-calculator.html
 * Completed: December 27, 2016
 */

import java.util.Scanner;

public class BabyCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String equation = "";
		int valueFirst, valueSecond;
		int answer = -1;
		do {
			System.out.print("Equation: ");
			equation = sc.nextLine();
			equation = equation.replaceAll("\\s+", "");
			valueFirst = Integer.parseInt(equation.substring(0, 1));
			valueSecond = Integer.parseInt(equation.substring(2, equation.length()));

			if (equation.contains("+")) {
				answer = valueFirst + valueSecond;
			} else if (equation.contains("-")) {
				answer = valueFirst - valueSecond;
			} else if (equation.contains("/")) {
				answer = valueFirst / valueSecond;
			} else if (equation.contains("%")) {
				answer = valueFirst % valueSecond;
			} else if (equation.contains("*")) {
				answer = valueFirst * valueSecond;
			} else {
				System.out.println("ERROR!");
			}
			System.out.println("The answer is: " + answer + ".\n");
		} while (equation.charAt(0) != '0');
		sc.close();
		System.out.println("Bye, now.");
	}
}