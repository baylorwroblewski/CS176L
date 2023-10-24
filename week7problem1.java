package week7;

import java.util.Scanner;

public class week7problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine().toLowerCase();

        if (isPalindrome(input)) {
            System.out.println("Yes, it's a palindrome.");
        } else {
            System.out.println("No, it's not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
