package week11;

import java.util.Scanner;

public class problem2 {
    public static int romanToDecimal(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            char current = roman.charAt(i);
            int currentValue = getValue(current);

            if (i + 1 < roman.length()) {
                char next = roman.charAt(i + 1);
                int nextValue = getValue(next);

                if (currentValue < nextValue) {
                    result += (nextValue - currentValue);
                    i++;  // Skip the next character as it has been considered.
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    private static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanInput = scanner.nextLine().toUpperCase();

        int decimalValue = romanToDecimal(romanInput);
        System.out.println("Decimal value: " + decimalValue);

        scanner.close();
    }
}
