/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-arrays-1.html
 * Completed: November 18, 2016
 */

public class BasicArrays1 {
	public static void main(String[] args) {
		int[] arrays = new int[10];
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = -113;
			System.out.println("Slot " + i + " contains a " + arrays[i] + ".");
		}
	}
}