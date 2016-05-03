package lab5;

import java.util.HashMap;

import java.util.HashMap;

public class CashRegisterTester{
	
	private static HashMap<MonetaryUnit, Integer> l;
	
	public static void main(String[] args){
		l = new HashMap<MonetaryUnit, Integer>();
		l.put(new MonetaryUnit(0.01), 3);
		l.put(new MonetaryUnit(0.05), 2);
		l.put(new MonetaryUnit(0.10), 1);
		l.put(new MonetaryUnit(0.25), 3);
		l.put(new MonetaryUnit(1.00), 1);
		l.put(new MonetaryUnit(5.00), 3);
		l.put(new MonetaryUnit(10.00), 5);
		l.put(new MonetaryUnit(20.00), 2);
		l.put(new MonetaryUnit(50.00), 1);
		l.put(new MonetaryUnit(100.00), 3);
		CashRegister l1 = new CashRegister(1000);
		System.out.println("Actual: "+l1.l1(l));
		System.out.println("Expected: 543.02");
	}
}
