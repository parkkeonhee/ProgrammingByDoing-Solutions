import java.util.Random;
import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		String[] words = { "leviathan", "hello" };

		int tries = 0;
		StringBuilder misses = new StringBuilder();
		int pickedSlot = generator.nextInt(words.length);
		String pickedWord = words[pickedSlot];
		char[] wordCharacters = new char[pickedWord.length()];
		char[] correctWord = new char[pickedWord.length()];
		char[] missedLetter = new char[26];
		System.out.println(pickedWord);
		for (int i = 0; i < pickedWord.length(); i++) {
			wordCharacters[i] = pickedWord.charAt(i);
		}

		char guess;
		boolean completed = false;
		boolean sameLetter = false;
		boolean finished = false;
		// tries <= 5
		while (!completed) {
			// tries++;
			System.out.println("_=_=_=_=_=_=_=_=_=_=_=_=_=_\n");
			System.out.print("Word:\t");
			for (int i = 0; i < pickedWord.length(); i++) {
				if (correctWord[i] == '\u0000') {
					System.out.print("_");
				} else if (correctWord[i] == wordCharacters[i]) {
					System.out.print(correctWord[i]);
				}
				if (i != pickedWord.length()) {
					System.out.print(" ");
				}
			}

			for (int i = 0; i < pickedWord.length(); i++) {
				if (correctWord[i] != '\u0000') {
					finished = true;
				} else if (correctWord[i] == '\u0000') {
					finished = false;
				}
			}

			if (finished) {
				String checkAnswer = String.copyValueOf(correctWord);
				if (checkAnswer.equalsIgnoreCase(pickedWord)) {
					System.out.println("\nYou got it!");
					completed = true;
				}
			}

			System.out.println("\n\nMisses:\t" + misses);
			System.out.print("\nGuess:\t");
			guess = sc.next().toLowerCase().charAt(0);
			for (int i = 0; i < pickedWord.length(); i++) {
				if (guess == wordCharacters[i]) {
					correctWord[i] = wordCharacters[i];
					sameLetter = true;
				}
			}
			if (!sameLetter) {
				misses.append(guess + " ");
			}
			sameLetter = false;
		}
		System.out.println();
		sc.close();
	}
}