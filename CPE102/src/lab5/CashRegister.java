package lab5;

import java.util.HashMap;
import java.util.Map;

public class CashRegister {
	private double l;
	
	public CashRegister(double l){
		this.l = l;
	}
	
	public double l1(HashMap<MonetaryUnit, Integer> l1l){
		double l1l1 = 0;
		for(Map.Entry<MonetaryUnit, Integer> l1l1l: l1l.entrySet()){
			l1l1+= l1l1l.getKey().l()*l1l1l.getValue();
		}
		return l-l1l1;
	}
}
