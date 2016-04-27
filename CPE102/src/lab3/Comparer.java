package lab3;

public class Comparer {
	private int sigFigs;
	
	public Comparer(int sigFigs){
		this.sigFigs = sigFigs;
	}
	
	public boolean areClose(double x1, double x2){
		return Math.abs(x1-x2)< Math.pow(10,-sigFigs);
	}
	
	public boolean roundToSame(double x1, double x2){
		return (Math.round((double)(x1*(Math.pow(10,sigFigs))/Math.pow(10,sigFigs)))) == (Math.round((double)(x2*(Math.pow(10,sigFigs))/Math.pow(10,sigFigs))));
	}
}
