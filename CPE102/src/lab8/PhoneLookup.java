package lab8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PhoneLookup
{
   public static void main(String[] args) throws IOException
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the name of the phonebook file: ");
      String fileName = in.nextLine();
 
      LookupTable table = new LookupTable();
      FileReader reader = new FileReader(fileName);
      table.read(new Scanner(reader));
      
      boolean more = true;
      while (more)
      {  
         System.out.println("Lookup N)ame, P)hone number, Q)uit?");
         String cmd = in.nextLine();
           
         if (cmd.equalsIgnoreCase("Q")) 
            more = false;
         else if (cmd.equalsIgnoreCase("N"))
         { 
            System.out.println("Enter name:");
            String n = in.nextLine();
            System.out.println("Phone number: " + table.lookup(n));
         }
         else if (cmd.equalsIgnoreCase("P"))
         { 
            System.out.println("Enter phone number:");
            String n = in.nextLine();
            System.out.println("Name: " + table.reverseLookup(n));
         }
      }
   }
}
