
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/copying-arrays.html
 * Completed: November 18, 2016
 */

import java.util.Random;

public class CopyingArrays {
	public static void main(String[] args) {
		Random generator = new Random();

		int[] array1 = new int[10];
		int[] array2 = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = generator.nextInt((100) + 1);
		}
		System.arraycopy(array1, 0, array2, 0, array1.length);
		array1[array1.length - 1] = -7;

		System.out.print("Array 1: ");
		for (int i : array1) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.print("Array 2: ");
		for (int i : array2) {
			System.out.print(i + " ");
		}
	}
}
