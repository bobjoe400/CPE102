package lab6;

public class Coin3 implements Comparable {

	private double value;
	private String name;
	
	public Coin3(double value, String name){
		this.value = value;
		this.name = name;
	}
	
	public double getValue(){
		return value;
	}
	
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Coin3 other = (Coin3) arg0;
		return value == other.getValue()? 0: value>other.getValue()? 1:-1;
	}

}
