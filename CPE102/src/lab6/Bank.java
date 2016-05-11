package lab6;

import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * A bank contains account numbers and balances of each customer.
 */
public class Bank {
	private ArrayList<BankAccount> accountList;

	/**
	 * Construct a Bank object.
	 */
	public Bank() {
		accountList = new ArrayList<BankAccount>();
	}

	/**
	 * Read a file with account numbers and balances and adds the accounts to
	 * the bank.
	 * 
	 * @param filename
	 *            the name of the file
	 */
	public void readFile(String filename) throws IOException {
		Scanner input = null;
		try {
			File f = new File(filename);
			input = new Scanner(f);
		} catch (Exception e) {
			throw new IOException("Incompatible types on input.");
		}
		while (input.hasNext()) {
			BankAccount acct = new BankAccount();
			acct.read(input);
			accountList.add(acct);
		}
	}

	/**
	 * Add an account to the bank.
	 * 
	 * @param b
	 *            the BankAccount reference
	 */
	public void addAccount(BankAccount b) {
		accountList.add(b);
	}

	/**
	 * Gets the account with the highest balance.
	 * 
	 * @return the account with the highest balance
	 */
	public BankAccount getHighestBalance() {
		BankAccount max = accountList.get(0);

		for (BankAccount account : accountList) {
			if (account.getBalance() > max.getBalance())
				max = account;
		}

		return max;
	}
}
