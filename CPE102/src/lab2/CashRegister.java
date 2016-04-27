package lab2;

/**
 * A cash register totals up sales and computes change due. Also keeps track of
 * the number of items in sale.
 */
public class CashRegister {
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	private double purchase;
	private double payment;
	private int itemCount;

	/**
	 * Constructs a cash register with no money in it.
	 */
	public CashRegister() {
		purchase = 0;
		payment = 0;
		itemCount = 0;
	}

	/**
	 * Records the purchase price of an item.
	 * 
	 * @param amount
	 *            the price of the purchased item
	 */
	public void recordPurchase(double amount) {
		double newTotal = purchase + amount;
		purchase = newTotal;
		itemCount++;
	}

	/**
	 * Enters the payment received from the customer.
	 * 
	 * @param dollars
	 *            the number of dollars in the payment
	 * @param quarters
	 *            the number of quarters in the payment
	 * @param dimes
	 *            the number of dimes in the payment
	 * @param nickels
	 *            the number of nickels in the payment
	 * @param pennies
	 *            the number of pennies in the payment
	 */
	public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
		payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE
				+ pennies * PENNY_VALUE;
	}	
	
	/**
	 * Computes the change due and resets the machine for the next customer.
	 * 
	 * @return the change due to the customer
	 */
	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		itemCount = 0;
		return Math.round(change*100)/100.0;
	}

	public int getItemCount() {
		// . . .
		return itemCount;
	}

	public int giveDollars() {
		// TODO Auto-generated method stub
		return (int) Math.floor(payment - purchase);
	}

	private int giveCents(double change, int type){
		int amount = 0;
		String x = String.valueOf(Math.round(change*100)/100.00);
		//System.out.println(x);
		String[] y = x.split("\\.");
		int cents = Integer.parseInt(y[1]);
		//System.out.println(cents);
		switch (type){
			case 1:
				amount = (((cents%25)%10)%5);
				break;
			case 5:
				//System.out.println(Math.floor(((cents%25)%10)/5));
				amount = (int) Math.floor(((cents%25)%10)/5);
				break;
			case 10:
				//System.out.println((int) Math.floor((cents%25)/10));
				amount = (int) Math.floor((cents%25)/10);
				break;
			case 25:
				amount = (int) Math.floor(cents/25);
				break;
		}
		return amount;
	}
	
	public int giveQuarters() {
		// TODO Auto-generated method stub 
		return giveCents(payment - purchase, 25);
	}

	public int giveDimes() {
		// TODO Auto-generated method stub
		//System.out.println(giveCents(payment - purchase, 10));
		return giveCents(payment - purchase, 10);
	}
	
	public int giveNickels() {
		return giveCents(payment - purchase, 5);
	}
	
	public int givePennies(){
		return giveCents(payment - purchase, 1);
	}
}
