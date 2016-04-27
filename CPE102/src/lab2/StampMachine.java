package lab2;

public class StampMachine {
	private int payment;
	private int change; 
	public StampMachine(){
		payment = 0;
		change = 0;
	}
	
	public void insert(int amt){
		payment = amt*100;
		change = payment;
	}
	
	public int giveFirstClassStamps(){
		change = payment%44;
		payment = payment - payment%44;
		return payment/44;
	}
	
	public int givePennyStamps(){
		payment = 0;
		return change;
	}
}
