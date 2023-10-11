import java.util.Scanner;

public class problemSet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", how many exams have you taken?");
        int numExams = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= numExams; i++) {
            int score;
            do {
                System.out.print("Give me the score of exam " + i + ": ");
                score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    System.out.print("Invalid score! Please give me the score of exam "+ i);
                }
            } while (score < 0 || score > 100);

            sum += score;
        }

        double average = (double) sum / numExams;

        System.out.println("Hi, " + name + ", your average score of " + numExams + " exams is " + average);
    }
}
