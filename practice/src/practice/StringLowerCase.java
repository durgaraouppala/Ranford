package practice;

import java.util.Scanner;

public class StringLowerCase {

	
	    public static void main(String[] input)
	    {
	        String strUpper, strLower;
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter one word/name in Lowercase : ");
	        strUpper = scan.nextLine();
	        
	        
	        strLower = strUpper.toLowerCase();
	        System.out.print("Equivalent Word/Name in Uppercase : " +strLower);
	    }
	}
	

