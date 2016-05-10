package lab6;

/**
 * This program tests the use of the Comparable interface in the coin class.
 */
public class CoinTester {
	public static void main(String[] args) {
		Coin3 c1 = new Coin3(0.05, "nickel");
		Coin3 c2 = new Coin3(0.01, "penny");

		int b = c1.compareTo(c2);

		if (b < 0)
			System.out.println("less");
		else if (b > 0)
			System.out.println("more");
		else
			System.out.println("equal");
		System.out.println("Expected: more");
	}
}
