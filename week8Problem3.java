package week8;

import java.util.Scanner;

public class week8Problem3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String value = scanner.nextLine();
		
		System.out.println("Enter character you want to remove: ");
		String value2 = scanner.nextLine();
		scanner.close();
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i <= value.length() - 1; i++) {
			char character = value2.charAt(0);
            if ( value.charAt(i) != character) {
            	result.append(value.charAt(i));
            }
            }
		System.out.println(result);

	}

}
