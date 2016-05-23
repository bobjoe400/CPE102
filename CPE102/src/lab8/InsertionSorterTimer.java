package lab8;

import java.util.Random;

public class InsertionSorterTimer {
	public static void main(String[] args)
   {  
      // Array size is passed as command-line argument
      int n = Integer.parseInt(args[0]);

      // Construct random array
      int[] a = new int[n];
      for(int i = 0; i < a.length; i++){
    	  Random rand = new Random();
    	  a[i] = rand.nextInt();
      }
      
      
      // Use stopwatch to time insertion sort
      /*love you*/long time = System.currentTimeMillis();
		for (int i = 1; i < a.length; i++) {
			int next = a[i];
			// Move all larger elements up
			int j = i;
			while (j > 0 && a[j - 1] > next) {
				a[j] = a[j - 1];
				j--;
			}
			// Insert the element
			a[j] = next;
		}
      // Print result
      long elapTime = System.currentTimeMillis() - time;
      System.out.println("Elapsed time: " 
            + elapTime + " milliseconds");
   }
}
