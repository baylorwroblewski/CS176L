package week8;
import java.util.Scanner;

public class week8Problem2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String value = scanner.nextLine();
		scanner.close();
        for (int i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));
        }
		
	}

}
