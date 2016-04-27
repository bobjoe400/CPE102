package lab2;

/**
 * An employee with a name and salary.
 */
public class Employee {
	private String name;
	private double salary;

	/**
	 * Constructs an employee.
	 * 
	 * @param employeeName
	 *            the employee name
	 * @param currentSalary
	 *            the employee salary
	 */
	public Employee(String employeeName, double currentSalary) {
		name = employeeName;
		salary = currentSalary;
	}

	/**
	 * Gets the employee name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the employee salary.
	 * 
	 * @return the salary/home/cay/books/bigj3/solutions/Ch03/ExP3_4/
	 */
	public double getSalary() {
		return Math.round(salary*100)/100.0;
	}

	/**
	 * Raises the salary by a given percentage.
	 * 
	 * @param percent
	 *            the percentage of the raise
	 */
	public void raiseSalary(double percent) {
		salary *= 1 + (percent / 100);
	}
}
