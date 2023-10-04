package week5;
import java.util.Scanner;

public class week5Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Check if the string is not empty
        if (!s.isEmpty()) {
            char firstChar = s.charAt(0);

            // Check if the first character is a numerical digit (between '0' and '9')
            if (firstChar == '0') {
                s = "zero" + s.substring(1);
            } else if (firstChar == '1') {
                s = "one" + s.substring(1);
            } else if (firstChar == '2') {
                s = "two" + s.substring(1);
            } else if (firstChar == '3') {
                s = "three" + s.substring(1);
            } else if (firstChar == '4') {
                s = "four" + s.substring(1);
            } else if (firstChar == '5') {
                s = "five" + s.substring(1);
            } else if (firstChar == '6') {
                s = "six" + s.substring(1);
            } else if (firstChar == '7') {
                s = "seven" + s.substring(1);
            } else if (firstChar == '8') {
                s = "eight" + s.substring(1);
            } else if (firstChar == '9') {
                s = "nine" + s.substring(1);
            }
        }

        System.out.println("Result: " + s);

        scanner.close();
    }
}
