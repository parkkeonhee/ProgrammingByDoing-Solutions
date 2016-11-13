
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/baby-nim.html
 * Completed: November 12, 2016
 */
import java.util.Scanner;

public class BabyNim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 3, B = 3, C = 3;
		String pileChosen = "";
		int removePile = 0;
		System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);
		System.out.println();
		do {
			System.out.print("Choose a pile: ");
			pileChosen = sc.nextLine();
			System.out.print("How many to remove from pile " + pileChosen + ": ");
			removePile = sc.nextInt();
			sc.nextLine();

			if (pileChosen.equalsIgnoreCase("A")) {
				A -= removePile;
			} else if (pileChosen.equalsIgnoreCase("B")) {
				B -= removePile;
			} else if (pileChosen.equalsIgnoreCase("C")) {
				C -= removePile;
			}

			System.out.println();
			System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);
			System.out.println();
		} while (!(A <= 0 && B <= 0 && C <= 0));
		sc.close();
		System.out.println("All piles are empty. Good job!");
	}
}