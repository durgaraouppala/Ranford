package collectionpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

class CompareStrings {
   public static void main(String[] args) throws Exception, IOException {
//      String[] coins = { "Penny", "nickel", "dime","Quarter", "dollar" };
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("How many elements you want to add to the array: ");
	      int n = Integer.parseInt(in.readLine());
	      String[] coins = new String[n];
	      System.out.println("enter the strings:");
	      for(int i = 0; i < n; i++){    	  
	         coins[i] = in.readLine();
	      }
	   Set<String> set = new TreeSet<String>();
      for (int i = 0; i < coins.length; i++)
         set.add(coins[i]);
      System.out.println(Collections.min(set));
      System.out.println(Collections.min(set, 
      String.CASE_INSENSITIVE_ORDER));
      for(int i=0;i<=coins.length;i++)
         System.out.print("");
      System.out.println(Collections.max(set));
      System.out.println(Collections.max(set, 
      String.CASE_INSENSITIVE_ORDER));
   }
}
