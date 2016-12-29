
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/xs-and-ys.html
 * Completed: December 29, 2016
 */

public class XsAndYs {
	public static void main(String[] args) {
		System.out.println("x\ty");
		System.out.println("-----------------");
		for (double x = -10.0; x <= 10.0; x += 0.5) {
			System.out.println(x + "\t" + Math.pow(x, 2));
		}
	}
}