package lab7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinSet {
	private LinkedHashMap<Coin, Integer> coins;
	private Scanner input;

	public static final Coin NICKLE = new Coin(Coin.NICKLE);
	public static final Coin DIME = new Coin(Coin.DIME);
	public static final Coin QUARTER = new Coin(Coin.QUARTER);
	public static final Coin DOLLAR = new Coin(Coin.DOLLAR);

	public CoinSet() {
		coins = new LinkedHashMap<Coin, Integer>();
		input = VendingMachineSimulation.input;
		fillMap();
	}

	public void fillMap() {
		coins.put(NICKLE, 0);
		coins.put(DIME, 0);
		coins.put(QUARTER, 0);
		coins.put(DOLLAR, 0);
	}

	public void addCoin() {
		printCoins();
		switch (input.nextLine().toUpperCase()) {
		case "A":
			coins.put(NICKLE, coins.get(NICKLE) + 1);
			break;
		case "B":
			coins.put(DIME, coins.get(DIME) + 1);
			break;
		case "C":
			coins.put(QUARTER, coins.get(DIME) + 1);
			break;
		case "D":
			coins.put(DOLLAR, coins.get(DIME) + 1);
			break;
		}
	}

	public void printCoins() {
		Iterator<Coin> it = coins.keySet().iterator();
		int counter = 0;
		while (it.hasNext()) {
			Coin c = it.next();
			System.out.println((char)('A' + counter) + ") " + c);
			counter++;
		}
	}

	public double sum() {
		double sum = 0;
		Iterator<Map.Entry<Coin, Integer>> it = coins.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Coin, Integer> pair = it.next();
			sum += pair.getKey().getValue() * pair.getValue();
		}
		return sum;
	}

	public void returnCoins() {
		System.out.println("Removed: $" + sum());
		fillMap();
	}
}
