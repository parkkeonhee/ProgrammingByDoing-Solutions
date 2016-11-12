import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		int myGuess;
		int theNumber;
		boolean done = false;
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		theNumber = generator.nextInt(10) + 1;
		int tries = 0;
		do {
			System.out.print("Your guess: ");
			myGuess = sc.nextInt();
			tries++;
			if (!(done = myGuess == theNumber)) {
				System.out.println("That is incorrect. Guess again.");
			}
		} while (!done);
		System.out.println("That's right! You are a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
		sc.close();
	}
}
