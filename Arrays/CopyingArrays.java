
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/copying-arrays.html
 * Completed: December 30, 2016
 */

import java.util.Random;

public class CopyingArrays {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] arrayOne = new int[10];
		int[] arrayTwo = new int[arrayOne.length];

		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = generator.nextInt(100) + 1;
			arrayTwo[i] = arrayOne[i];
		}
		arrayOne[arrayOne.length - 1] = -7;

		System.out.print("Array 1: ");
		for (int i : arrayOne) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.print("Array 2: ");
		for (int i : arrayTwo) {
			System.out.print(i + " ");
		}
	}
}