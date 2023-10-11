import java.util.Scanner;

public class problemSet1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        while (true) {
            System.out.println("Hello, " + name);
        }
    }
}
