import java.util.Scanner;

public class problemSet3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give me a sentence: ");
        String input = scanner.nextLine();

        boolean containsNumericalCharacters = false;

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (character >= '0' && character <= '9') {
                containsNumericalCharacters = true;
                break;
            }
        }

        if (containsNumericalCharacters) {
            System.out.println(input + " contains numerical characters, please check it again.");
        } else {
            System.out.println("No numerical characters.");
        }
    }
}
