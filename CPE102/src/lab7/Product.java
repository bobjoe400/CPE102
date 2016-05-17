package lab7;

import java.util.Scanner;

public class Product {

	private String desc;
	private double price;
	private static Scanner input;

	public Product() {
		input = VendingMachineSimulation.input;
		System.out.println("Description: ");
		desc = input.nextLine();
		System.out.println("Price");
		price = Double.parseDouble(input.nextLine());
	}

	public static int makeValue() {
		System.out.println("Quantity: ");
		int value = Integer.parseInt(input.nextLine());
		return value;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return desc + " @ $" + price;
	}
}
