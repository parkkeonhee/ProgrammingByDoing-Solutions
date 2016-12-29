
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/baby-nim.html
 * Completed: December 27, 2016
 */

import java.util.Scanner;

public class BabyNim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 3;
		int B = 3;
		int C = 3;
		System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);

		String pileChosen = "";
		int pileRemove;
		boolean finished = false;
		while (!finished) {
			System.out.print("\nChoose a pile: ");
			pileChosen = sc.nextLine();
			System.out.print("How many to remove from pile " + pileChosen + ": ");
			pileRemove = sc.nextInt();
			sc.nextLine();

			if (pileChosen.equalsIgnoreCase("A")) {
				A -= pileRemove;
			} else if (pileChosen.equalsIgnoreCase("B")) {
				B -= pileRemove;
			} else if (pileChosen.equalsIgnoreCase("C")) {
				C -= pileRemove;
			} else {
				System.out.println("Non-existing pile. Try again.");
			}
			System.out.println("\nA: " + A + "\tB: " + B + "\tC: " + C);

			if (A <= 0 && B <= 0 && C <= 0) {
				finished = true;
			}
		}
		sc.close();
		System.out.println("\nAll piles are empty. Good job!");
	}
}