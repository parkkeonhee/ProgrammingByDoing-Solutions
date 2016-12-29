
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/age-in-five-years.html
 * Completed: December 21, 2016
 */

import java.util.Scanner;

public class AgeIn5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Hello! What is your name? ");
		String name = sc.nextLine();

		System.out.println();
		System.out.print("Hi, " + name + "! How old are you? ");
		int age = sc.nextInt();
		sc.close();

		System.out.println();
		System.out.println("Did you know that in five years, you will be " + (age + 5) + " years old?");
		System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
	}
}