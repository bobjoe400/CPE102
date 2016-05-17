package lab7;

import java.util.Scanner;

public class VendingMachineSimulation {
	private static VendingMachineMenu vm;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		vm = new VendingMachineMenu();
		while (true) {
			if(!vm.makeChoice()){
				break;
			}
		}
		input.close();
	}
}
