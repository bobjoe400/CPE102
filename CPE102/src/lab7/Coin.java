package lab7;

public class Coin {

	public static final double NICKLE = 0.05;
	public static final double DIME = 0.10;
	public static final double QUARTER = 0.25;
	public static final double DOLLAR = 1.00;

	private double value;
	private String name;

	public Coin(double value) {
		this.value = value;
		switch ((int) (value * 100)) {
		case 5:
			name = "nickel";
			break;
		case 10:
			name = "dime";
			break;
		case 25:
			name = "quarter";
			break;
		case 100:
			name = "dollar";
			break;
		}
	}

	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}

	public String toString() {
		return name + " @ " + value;
	}
}
