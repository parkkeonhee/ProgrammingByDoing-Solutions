
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-arrays-1.html
 * Completed: December 30, 2016
 */

public class BasicArrays1 {
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = -113;
			System.out.println("Slot " + i + " contains a " + array[i]);
		}
	}
}