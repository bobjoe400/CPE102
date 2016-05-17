package lab7;

public class Sentence {
	private String sent;
	private int counter = 0;
	private String worker;

	public Sentence(String s) {
		sent = worker = s;
	}

	public int find(String loo) {
		
		if(worker.startsWith(loo)){
			return counter-1;
		}else{
			worker = sent.substring(counter);
			if(worker.length() < loo.length()){
				return -1;
			}
			counter++;
			return find(loo);
		}
	}
}
