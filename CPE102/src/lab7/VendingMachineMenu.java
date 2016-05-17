package lab7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class VendingMachineMenu {
	private VendingMachine v;
	private static Scanner input;

	public VendingMachineMenu() {
		v = new VendingMachine();
		input = VendingMachineSimulation.input;
	}

	public boolean makeChoice() {
		System.out.println("S)how products  I)nsert coin  B)uy  A)dd product  R)emove coins  Q)uit");
		String s = input.nextLine().toUpperCase();
		boolean b = true;
		switch (s) {
		case "S":
			showProducts();
			b = true;
			break;
		case "I":
			v.insertCoin();
			b =  true;
			break;
		case "B":
			purchase();
			b = true;
			break;
		case "A":
			v.addProduct();
			b = true;
			break;
		case "R":
			v.removeCoins();
			b = true;
			break;
		case "Q":
			b = false;
			break;
		}
		return b;
	}

	public void showProducts() {
		Iterator<Map.Entry<Product, Integer>> it = v.getProducts().entrySet().iterator();
		int counter = 0;
		while (it.hasNext()) {
			Map.Entry<Product, Integer> pair = it.next();
			if (pair.getValue() == 0) {
				continue;
			}
			System.out.println((char)('A' + counter) + ") " +pair.getKey());
			counter++;
		}
	}

	public void purchase() {
		showProducts();
		String s = input.nextLine();
		ArrayList<Product> keys = new ArrayList<Product>(v.getProducts().keySet());
		Product choice = keys.get(s.toUpperCase().charAt(0) - 'A');
		if(v.purchase(choice)){
			System.out.println("Purchased: " + choice);
		}
		input.close();
	}
}
