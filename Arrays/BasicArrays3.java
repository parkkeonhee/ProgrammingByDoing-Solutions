
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/basic-arrays-3.html
 * Completed: November 18, 2016
 */
import java.util.Random;

public class BasicArrays3 {
	public static void main(String[] args) {
		Random generator = new Random();
		int[] array = new int[1000];

		for (int i = 0; i < array.length; i++) {
			if (i != 0 && i % 15 == 0) {
				System.out.println();
			}
			array[i] = generator.nextInt(90) + 10;
			System.out.print(array[i] + "  ");
		}
	}
}