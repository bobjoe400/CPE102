package lab9;

import java.util.Iterator;
import java.util.LinkedList;

public class Business {
	
	public static void downsize(LinkedList<String> staff){
		int size = staff.size();
		int cnt = 1;
		Iterator<String> it = staff.listIterator();
		while(it.hasNext()){
			if((cnt&1) == 0){
				it.next();
				it.remove();
			}else{
				it.next();
			}
			cnt++;
		}
		
	}
}
