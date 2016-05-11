package lab2;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

import lab6.InsufficientFundsException;
import lab6.NegativeAmountException;
import lab6.NegativeBalanceException;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount implements Formattable {
	private double balance;

	/**
	 * Constructs a bank account with a zero balance
	 */
	public BankAccount() {
		balance = 0;
	}

	/**
	 * Constructs a bank account with a given balance
	 * 
	 * @param initialBalance
	 *            the initial balance
	 */
	public BankAccount(double initialBalance) {
		if(initialBalance < 0){
			throw new NegativeBalanceException();
		}
		balance = initialBalance;
	}

	/**
	 * Deposits money into the bank account.
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	public void deposit(double amount) {
		if(amount < 0){
			throw new NegativeAmountException();
		}
		double newBalance = balance + amount;
		balance = newBalance;
	}

	/**
	 * Withdraws money from the bank account.
	 * 
	 * @param amount
	 *            the amount to withdraw
	 */
	public void withdraw(double amount) {
		
		double newBalance = balance - amount;
		balance = newBalance;
		if(newBalance < 0){
			throw new InsufficientFundsException();
		}
	}

	/**
	 * Gets the current balance of the bank account.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * . . .
	 */
	public void addInterest(double rate) {
		balance*=(1+(rate/100));
	}

	@Override
	public void formatTo(Formatter arg0, int arg1, int arg2, int arg3) {
		Appendable a = arg0.out();
		String bal = Double.toString(balance);
		while(bal.length() < 10){
			bal= " "+bal;
		}
		try {
			a.append(bal);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
