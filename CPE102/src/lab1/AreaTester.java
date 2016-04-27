package lab1;
import java.awt.Rectangle; 

public class AreaTester {
	public static void main(String[] args){
		Rectangle rect = new Rectangle(5,10,30,30);
		System.out.println(rect.getWidth()*rect.getHeight());
		System.out.println("Expected: 900");
	}
}
