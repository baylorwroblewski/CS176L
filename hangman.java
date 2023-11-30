package week12;

import java.util.Scanner;

public class hangman {
    private static final String[] WORDS = {"apple", "banana", "orange", "grape", "cherry"};

    private String selectedWord;
    private StringBuilder guessedWord;
    private StringBuilder guessedLetters;
    private int wrongGuessCount;

    public hangman() {
        selectedWord = WORDS[(int) (Math.random() * WORDS.length)];
        guessedWord = new StringBuilder("_".repeat(selectedWord.length()));
        guessedLetters = new StringBuilder();
        wrongGuessCount = 0;
    }

    private void displayGameState() {
        System.out.println("Guesses: " + wrongGuessCount + ", Hangman: " + "X".repeat(wrongGuessCount));
        System.out.println("Guessed Letters: " + guessedLetters);
        System.out.println("Word: " + guessedWord + ", Hint: food");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (wrongGuessCount < 6 && guessedWord.indexOf("_") != -1) {
            displayGameState();
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (!Character.isLetter(guess) || guessedLetters.indexOf(String.valueOf(guess)) != -1) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }

            guessedLetters.append(guess);

            if (selectedWord.indexOf(guess) != -1) {
                for (int i = 0; i < selectedWord.length(); i++) {
                    if (selectedWord.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                    }
                }
            } else {
                wrongGuessCount++;
            }
        }

        displayFinalResult();
        scanner.close();
    }

    private void displayFinalResult() {
        System.out.println(wrongGuessCount < 6 ? "Congratulations! You guessed the word: " + guessedWord
                : "Sorry, you ran out of guesses. The word was: " + selectedWord);
    }

    public static void main(String[] args) {
        new hangman().play();
    }
}
