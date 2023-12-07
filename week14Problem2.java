package week14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class week14Problem2 {

    public static void main(String[] args) {
        try {
            checkForDuplicates();
            System.out.println("No duplicates found.");
        } catch (DuplicateNumberException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    private static void checkForDuplicates() throws DuplicateNumberException {
        try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> numbers = new ArrayList<>();

			System.out.println("Enter a list of integers (enter a non-integer to finish):");
			while (scanner.hasNextInt()) {
			    int number = scanner.nextInt();
			    if (numbers.contains(number)) {
			        throw new DuplicateNumberException("Duplicate number found: " + number);
			    } else {
			        numbers.add(number);
			    }
			}
		}
    }
    
    @SuppressWarnings("serial")
    static class DuplicateNumberException extends Exception {
        public DuplicateNumberException(String message) {
            super(message);
        }
    }
}
