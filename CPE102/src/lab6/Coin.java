package lab6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   A coin with a monetary value.
*/
public class Coin
{
   private double value;
   private String name;

   /**
      Constructs a default coin. Use the read method to fill in the value and name.
   */
   public Coin()
   {
      value = 0;
      name = "";
   }

   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }

   /**
      Reads a coin value and name.
      @param in the Scanner
   */
   public void read(Scanner in) throws IOException
   {

   }
   
   /**
      Reads a file with coin values.
      @param filename the file name
      @return an array of coins in the file
   */
   public static ArrayList<Coin> readFile(String filename) throws IOException
   {
	   ArrayList<Coin> coins = new ArrayList<Coin>();
	   Scanner in = null;
	   try{
		   File f = new File(filename);
		   in = new Scanner(f);
	   }catch(Exception e){
		   throw new IOException();
	   }
	   while(in.hasNextLine()){
		   Coin c = new Coin();
		   try{
			  String data[] = in.nextLine().split(" ");
			  String name = data[0];
			  double value = Double.parseDouble(data[1]);
			  c = new Coin(value, name);
		   }catch(Exception e){
			   throw new IOException("Coin value must be of type double.");
		   }
		   coins.add(c);
	   }
	   in.close();
	   return coins;
   }
}
