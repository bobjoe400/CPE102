package lab6;

import java.io.File;

public class Reverse {
	public static void main(String[] args){
		Reverser rev = new Reverser(new File(args[0]));
		rev.getReverse();
	}
}
