package lab8;

import java.util.Arrays;

/**
   This class tests the MergeSorter class to sort 
   an array of strings.
*/
public class MergeSorterTester
{  
   public static void main(String[] args)
   { 
      String[] a = { "Able", "was", "I", "ere", "I", "saw", "Elba" };
      MergeSorter m = new MergeSorter(a);
      m.sort();
      System.out.println(Arrays.toString(a));
      System.out.println("Expected: [Able, Elba, I, I, ere, saw, was]");
   }
}
