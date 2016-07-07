package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateNumber {
	
	
	public static void  main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		List<Integer> lst=new ArrayList<>();
		System.out.println("Enter the count of numbers");
		int num=Integer.parseInt(s.nextLine());
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the values");
			lst.add(s.nextInt());
		}
		System.out.println(lst);
		for(int j=0;j<=lst.size();j++)
		{
			for(int k=1;k<=lst.size()+1;k++)
			{
				if(j==k){
				System.out.println(k);
				}
			}
		}
		System.out.println(lst);
	}
	
}
