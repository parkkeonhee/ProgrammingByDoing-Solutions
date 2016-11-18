/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/giving-an-array-a-bunch-of-values-at-once.html
 * Completed: November 18, 2016
 */

public class GivingAnArrayABunchOfValuesAtOnce {
	public static void main(String[] args) {
		String[] array1 = { "alpha", "bravo", "charlie", "delta", "echo" };

		System.out.println("The first array is filled with the following values:");
		int index = 0;
		for (String i : array1) {
			if (index == 0) {
				System.out.print("\t");
			}
			System.out.print(i + " ");
			index++;
		}
		System.out.println();
		int[] array2 = { 11, 23, 37, 41, 53 };
		System.out.println("The second array is filled with the following values:");

		index = 0;
		for (int i : array2) {
			if (index == 0) {
				System.out.print("\t");
			}
			System.out.print(i + " ");
			index++;
		}
	}
}