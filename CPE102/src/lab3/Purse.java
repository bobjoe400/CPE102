package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
   A purse holds a collection of coins.
*/
public class Purse
{
   private ArrayList<String> coins;

   /**
      Constructs an empty purse.
   */
   public Purse()
   {
      coins = new ArrayList<String>();
   }

   /**
      Add a coin to the purse.
      @param coinName the coin to add
   */
   public void addCoin(String coinName)
   {
      coins.add(coinName);
   }

   public boolean sameCoins(Purse other){
	   /*int[] nums = new int[4];
	   int[] nums1 = new int[4];
	   for(String i: coins){
		   switch(i){
		   case "Quarter":
			   nums[0]++;
			   break;
		   case "Dime":
			   nums[1]++;
			   break;
		   case "Nickle":
			   nums[2]++;
			   break;
		   case "Penny":
			   nums[3]++;
			   break;
		   }
	   }
	   for(String i: other.coins){
		   switch(i){
		   case "Quarter":
			   nums1[0]++;
			   break;
		   case "Dime":
			   nums1[1]++;
			   break;
		   case "Nickle":
			   nums1[2]++;
			   break;
		   case "Penny":
			   nums1[3]++;
			   break;
		   }
	   }*/
	   //return Arrays.equals(nums, nums1);
	   Collections.sort(coins);
	   Collections.sort(other.coins);
	   return coins.equals(other.coins);
   }
   
   /**
      Returns a string describing the object.
      @return a string in the format "Purse[coinName1,coinName2,...]"
   */
   public String toString()
   {
	  String coins = "Purse[";
	  for(int i=0; i<this.coins.size(); i++){
		  if(i != this.coins.size()-1){
			  coins+= this.coins.get(i) + ",";
		  }else{
			  coins+= this.coins.get(i);
		  }
	  }
	  return coins+"]";
   }

   /**
      Transfer the coins from one purse to another.
      @param other the other purse
   */   
   public void transfer(Purse other)
   {      
	   for(String i : other.coins){
		   coins.add(i);
	   }	
	   other.coins.clear();
   }     
}
