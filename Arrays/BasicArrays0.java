/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-arrays-0.html
 * Completed: November 18, 2016
 */

public class BasicArrays0 {
	public static void main(String[] args) {
		int[] arrays = new int[10];
		arrays[0] = -113;
		arrays[1] = -113;
		arrays[2] = -113;
		arrays[3] = -113;
		arrays[4] = -113;
		arrays[5] = -113;
		arrays[6] = -113;
		arrays[7] = -113;
		arrays[8] = -113;
		arrays[9] = -113;

		for (int i = 0; i < arrays.length; i++) {
			System.out.println("Slot " + i + " contains a " + arrays[i] + ".");
		}
	}
}