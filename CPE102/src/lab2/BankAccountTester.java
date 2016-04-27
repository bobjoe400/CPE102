package lab2;

/**
 * Tests the bank account class with interest.
 */
public class BankAccountTester {
	public static void main(String[] args) {
		BankAccount momsSavings = new BankAccount(1000);
		momsSavings.addInterest(10);
		System.out.print("Balance: ");
		System.out.println(momsSavings.getBalance());
		System.out.println("Expected: 1100");
	}
}
