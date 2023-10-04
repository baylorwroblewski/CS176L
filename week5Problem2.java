package week5;

import java.util.Scanner;

public class week5Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int n = scanner.nextInt();

        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second integer: ");
        int m = scanner.nextInt();

        double result = 0;

        switch (operator) {
            case '+':
                result = n + m;
                break;
            case '-':
                result = n - m;
                break;
            case '*':
                result = n * m;
                break;
            case '/':
                if (m != 0) {
                    result = (double) n / m;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Invalid operator entered.");
                System.exit(1);
        }

        System.out.printf("%d %c %d = %.2f%n", n, operator, m, result);

        scanner.close();
    }
}

