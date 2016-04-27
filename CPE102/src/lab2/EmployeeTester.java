package lab2;

/**
 * This program tests the Employee class.
 */
public class EmployeeTester {
	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker", 50000);
		harry.raiseSalary(10);
		// TODO: Test getName, getSalary methods
		System.out.println(harry.getName());
		System.out.println(harry.getSalary());
		System.out.println("Expected:55000");
	}
}