package practice;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		int arr[] = {10, 20, 30, 89, 259, 625};
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=Integer.parseInt(s.nextLine());
		for (int i=0; i<arr.length; i++)
		{
			
			if(arr[i] == n)
			{
				System.out.println("element was found Successfully");
				
			}
			else 
			{
				System.out.println("Element not found");
			}
		}
	}

}
