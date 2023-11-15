package week11;

import java.util.Arrays;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing uppercase alphabets and integer digits: ");
        String input = scanner.nextLine();

        rearrangeAndSum(input);

        scanner.close();
    }

    public static void rearrangeAndSum(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);

        StringBuilder result = new StringBuilder();
        int sum = 0;

        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                result.append(c);
            } else if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        result.append(sum);

        System.out.println("Input: " + input + "\tOutput: " + result.toString());
    }
}
