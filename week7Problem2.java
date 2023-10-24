package week7;

import java.util.Scanner;

public class week7Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive number (between 0 and 1000): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive number (between 0 and 1000): ");
        int num2 = scanner.nextInt();

        if (isValidInput(num1, num2)) {
            int gcd = calculateGCD(num1, num2);
            System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcd);
        } else {
            System.out.println("Invalid input. Please enter positive numbers in the range [0, 1000].");
        }

        scanner.close();
    }

    public static boolean isValidInput(int num1, int num2) {
        return num1 >= 0 && num1 <= 1000 && num2 >= 0 && num2 <= 1000;
    }

    public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateGCD(num2, num1 % num2);
    }
}
