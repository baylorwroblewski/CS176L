package week14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class PositiveNumber extends Exception{

	private static final long serialVersionUID = 1L;
	
	public PositiveNumber(String message) {
		super(message);
	}
	
}

public class week14Problem1 {

    public static void main(String[] args) {
        String fileName = "nums.txt";

        try {
            checkPositiveEvenNumbers(fileName);
            System.out.println("All numbers are negative.");
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    private static void checkPositiveEvenNumbers(String fileName) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > 0) {
                    throw new PositiveNumber("Positive number found: " + number);
                }
            }
        } catch (IOException e) {
            throw new Exception("Error reading the file: " + e.getMessage());
        }
    }
}
