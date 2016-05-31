package lab9;

import java.util.LinkedList;

/**
   A test class for the downsize method.
*/
public class DownsizeTester
{ 
   public static void main(String[] args)
   { 
      LinkedList<String> staff = new LinkedList<String>();
      staff.addLast("Dick");
      staff.addLast("Harry");
      staff.addLast("Romeo");
      staff.addLast("Tom");

      Business.downsize(staff);

      System.out.println(staff);
      System.out.println("Expected: [Dick, Romeo]");
   }
}
