package week5;
import java.util.Scanner;
//Write a program, please use scanner to read two user’ name, print 
//“same name” + name if the two are the same. 
//Otherwise, print “name1 and name2 are different

public class week5Problem1 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter first name: "); 
		String user1 =scanner.nextLine();
		
		System.out.println("Enter second name: "); 
		String user2 =scanner.nextLine();
		
		if (user1.equals(user2)) {
			System.out.println("Same name " + user1);
		}else {
			System.out.println(user1 + " and " + user2 + " are different.");
		}
	}

}
