
/*
 * Author: Keon Hee Park
 * Assignment: http://programmingbydoing.com/a/nim.html
 * Completed: December 27, 2016
 */

import java.util.Scanner;

public class Nim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 3;
		int B = 4;
		int C = 5;

		System.out.print("Player 1, enter your name: ");
		String playerOne = sc.nextLine();
		System.out.print("Player 2, enter your name: ");
		String playerTwo = sc.nextLine();

		String currentPlayer = "";
		String pileChosen = "";
		int pileRemove;
		System.out.print("\nA: ");
		for (int i = 0; i < A; i++) {
			System.out.print("*");
		}
		System.out.print("\nB: ");
		for (int i = 0; i < B; i++) {
			System.out.print("*");
		}
		System.out.print("\nC: ");
		for (int i = 0; i < C; i++) {
			System.out.print("*");
		}
		int playerCounter = 1;
		boolean finished = false;

		while (!finished) {

			if (playerCounter % 2 != 0) {
				System.out.print("\n\n" + playerOne + ", choose a pile: ");
				currentPlayer = playerOne;
			} else {
				System.out.print("\n\n" + playerTwo + ", choose a pile: ");
				currentPlayer = playerTwo;
			}
			pileChosen = sc.nextLine();
			System.out.print("How many to remove from pile " + pileChosen + ": ");
			pileRemove = sc.nextInt();
			sc.nextLine();
			boolean cheatOne = false;
			while (!cheatOne) {
				if (pileRemove <= 0) {
					System.out.print("\nYou must choose at least 1. How many? ");
					pileRemove = sc.nextInt();
					sc.nextLine();
				} else if (pileChosen.equalsIgnoreCase("A")) {
					if (A <= 0) {
						System.out.println("\nNice try, " + currentPlayer + ". That pile is empty.");

						System.out.print("\nA: ");
						for (int i = 0; i < A; i++) {
							System.out.print("*");
						}
						System.out.print("\nB: ");
						for (int i = 0; i < B; i++) {
							System.out.print("*");
						}
						System.out.print("\nC: ");
						for (int i = 0; i < C; i++) {
							System.out.print("*");
						}

						System.out.print("\n\nChoose again: ");
						pileChosen = sc.nextLine();
						System.out.print("How many to remove from pile " + pileChosen + ": ");
						pileRemove = sc.nextInt();
						sc.nextLine();
					} else if (pileRemove > A) {
						System.out.print("Pile " + pileChosen + " doesn't have that many. Try again: ");
						pileRemove = sc.nextInt();
						sc.nextLine();
					} else {
						A -= pileRemove;
						cheatOne = true;
					}
				} else if (pileChosen.equalsIgnoreCase("B")) {
					if (B <= 0) {
						System.out.println("\nNice try, " + currentPlayer + ". That pile is empty.");

						System.out.print("\nA: ");
						for (int i = 0; i < A; i++) {
							System.out.print("*");
						}
						System.out.print("\nB: ");
						for (int i = 0; i < B; i++) {
							System.out.print("*");
						}
						System.out.print("\nC: ");
						for (int i = 0; i < C; i++) {
							System.out.print("*");
						}

						System.out.print("\n\nChoose again: ");
						pileChosen = sc.nextLine();
						System.out.print("How many to remove from pile " + pileChosen + ": ");
						pileRemove = sc.nextInt();
						sc.nextLine();
					} else if (pileRemove > B) {
						System.out.print("Pile " + pileChosen + " doesn't have that many. Try again: ");
						pileRemove = sc.nextInt();
						sc.nextLine();
					} else {
						B -= pileRemove;
						cheatOne = true;
					}
				} else if (pileChosen.equalsIgnoreCase("C")) {
					if (C <= 0) {
						System.out.println("\nNice try, " + currentPlayer + ". That pile is empty.");

						System.out.print("\nA: ");
						for (int i = 0; i < A; i++) {
							System.out.print("*");
						}
						System.out.print("\nB: ");
						for (int i = 0; i < B; i++) {
							System.out.print("*");
						}
						System.out.print("\nC: ");
						for (int i = 0; i < C; i++) {
							System.out.print("*");
						}

						System.out.print("\n\nChoose again: ");
						pileChosen = sc.nextLine();
						System.out.print("How many to remove from pile " + pileChosen + ": ");
						pileRemove = sc.nextInt();
						sc.nextLine();
					} else if (pileRemove > C) {
						System.out.print("Pile " + pileChosen + " doesn't have that many. Try again: ");
						pileRemove = sc.nextInt();
						sc.nextLine();
					} else {
						C -= pileRemove;
						cheatOne = true;
					}
				} else {
					System.out.println("\nNice try, " + currentPlayer + ".");
					System.out.println(pileChosen + " is a non-existing pile.");
					System.out.print("Choose again: ");
					pileChosen = sc.nextLine();
					System.out.print("How many to remove from pile " + pileChosen + ": ");
					pileRemove = sc.nextInt();
					sc.nextLine();
				}
			}

			System.out.print("\nA: ");
			for (int i = 0; i < A; i++) {
				System.out.print("*");
			}
			System.out.print("\nB: ");
			for (int i = 0; i < B; i++) {
				System.out.print("*");
			}
			System.out.print("\nC: ");
			for (int i = 0; i < C; i++) {
				System.out.print("*");
			}
			if ((A + B + C) == 1 || (A + B + C) == 0) {
				finished = true;
			}

			playerCounter++;
		}
		sc.close();
		String winner = "";
		String loser = "";

		if (playerCounter % 2 == 0) {
			winner = playerOne;
			loser = playerTwo;
		} else {
			winner = playerTwo;
			loser = playerOne;
		}
		System.out.println("\n\n" + loser + ", you must take the last remaining counter, so you lose.");
		System.out.println(winner + " wins the game!");
	}
}