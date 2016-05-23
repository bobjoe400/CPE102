package lab8;

import java.util.Scanner;

/**
 * This class tests the Person class.
 */
public class PersonDemo {
	public static void main(String[] args) {
		int count = 0;
		Scanner in = new Scanner(System.in);

		boolean more = true;
		Person first = null;
		Person last = null;
		
		
		
		
		while (more) {
			System.out.println("Please enter the person's name or a blank line to quit");
			String name = in.nextLine();

			if (name.equals(""))
				more = false;
			else {
				Person p = new Person(name);
				if (first == null && last == null) {
					first = p;
					last = p;
				}
				// call first.compareTo(p), last.compareTo(p)
				if (first.compareTo(p) > 0) {
					first = p;
				}
				if (last.compareTo(p) < 0) {
					last = p;
				}
			}
		}

		System.out.println("First: " + first);
		System.out.println("Last: " + last);
	}
}