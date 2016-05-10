package lab6;

public class Coin implements Comparable {

	private double value;
	private String name;
	
	public Coin(double value, String name){
		this.value = value;
		this.name = name;
	}
	
	public double getValue(){
		return value;
	}
	
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Coin other = (Coin) arg0;
		return value == other.getValue()? 0: value>other.getValue()? 1:-1;
	}

}
