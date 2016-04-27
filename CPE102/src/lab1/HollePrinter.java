package lab1;

public class HollePrinter {

	public static void main(String[] args){
		String x = "Hello, World!"; 
		x = x.replace('e', 'v');
		x = x.replace('o', 'e');
		x = x.replace('v', 'o');
		System.out.println(x);
		System.out.println();
	}
}
