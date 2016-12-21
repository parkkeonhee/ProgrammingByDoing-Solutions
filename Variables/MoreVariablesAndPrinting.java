/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/more-variables-and-printing.html
 * Completed: December 21, 2016
 */

public class MoreVariablesAndPrinting {
	public static void main(String[] args) {
		String person = "Zed A. Shaw";
		int age = 35;
		int height = 74;
		int weight = 180;
		String eyeColor = "Blue";
		String hairColor = "Brown";
		String teethColor = "White";

		System.out.println("Let's talk about " + person + ".");
		System.out.println("He's " + height + " inches tall.");
		System.out.println("He's " + weight + " pounds heavy.");
		System.out.println("Actually that's not too heavy.");
		System.out.println("He's got " + eyeColor + " eyes and " + hairColor + " hair.");
		System.out.println("His teeth are usually " + teethColor + " depending on the coffee.");
		System.out.println(
				"If I add " + age + ", " + height + ", and " + weight + " I get " + (age + height + weight) + ".");
	}
}