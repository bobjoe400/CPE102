package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;

/**
 * A table for lookups and reverse lookups
 */
public class LookupTable {
	HashMap<String, Double> phoneNumbers;

	/**
	 * Constructs a LookupTable object.
	 */
	public LookupTable() {
		phoneNumbers = new HashMap<String, Double>();
	}

	/**
	 * Reads key/value pairs.
	 * 
	 * @param in
	 *            the scanner for reading the input
	 */
	public void read(Scanner in) {
		while (in.hasNext()) {
			String s = in.nextLine();
			String[] s2 = in.nextLine().split("-");
			double num = Double.parseDouble(s2[0]) + Double.parseDouble(s2[1]) / 10000;
			phoneNumbers.put(s, num);
		}
	}

	/**
	 * Looks up an item in the table.
	 * 
	 * @param k
	 *            the key to find
	 * @return the value with the given key, or null if no such item was found.
	 */
	public String lookup(String k) {
		if (phoneNumbers.get(k) == null) {
			return null;
		}
		String s = Double.toString(phoneNumbers.get(k));
		String[] sa = s.split("\\.");
		return sa[0]+"-"+sa[1];
	}

	/**
	 * Looks up an item in the table.
	 * 
	 * @param v
	 *            the value to find
	 * @return the key with the given value, or null if no such item was found.
	 */
	public String reverseLookup(String k) {
		String[] s2 = k.split("-");
		double num = Double.parseDouble(s2[0]) + Double.parseDouble(s2[1]) / 10000;
		ArrayList<Double> numbers = new ArrayList<Double>(phoneNumbers.values());
		Collections.sort(numbers);
		boolean found = false;
		int L,R,m;
		R = numbers.size()-1;
		L = 0;
		while(!found){
			if(L > R){
				break;
			}else{
				m = Math.floorDiv(L+R,2);
			}
			if(numbers.get(m) < num){
				L = m+1;
			}else{
				R = m-1;
			}
			if(numbers.get(m)== num){
				found = true;
			}
		}
		if(!found){
			return null;
		}
	    for (Entry<String, Double> entry : phoneNumbers.entrySet()) {
	        if (Objects.equals(num, entry.getValue())) {
	            return ""+entry.getKey();
	        }
	    }
		return "";
	}
}
