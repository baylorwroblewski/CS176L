class BankAccount {
	public String accountName;
	public double accountBalance;

	
	public BankAccount (String name, double balance) {
		accountName = name;
		accountBalance = balance;
	}
	
	public double deposit(double depositAm) {
		return accountBalance += depositAm;
	}
	
	public double withdraw (double withdrawAm) {
		return accountBalance -= withdrawAm;
	}
	public double balance () {
		return accountBalance;
	}
	
	
}
public class Problem2 {

	public static void main(String[] args) {
		BankAccount Baylor = new BankAccount("Baylor", 0);
		System.out.println("Account Balance: " + Baylor.balance());
		System.out.println("Amount After Deposit: " + Baylor.deposit(10000));
		System.out.println("Amount After Withdraw: " + Baylor.withdraw(1000));
		
	}

}
