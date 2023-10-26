package week8;

import java.util.Scanner;

public class week8Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        scanner.close();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (!Character.isWhitespace(character)) {
                result.append(character);
                }
        }
        System.out.println("String without spaces: " + result);
    }
}
