package practice;

import java.util.Scanner;

public class Element {

	public static void main(String[] args) {

		int flag=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of values in the array:");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter all the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();

		}
		System.out.println("not repeating elements are:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i != j)
				{
					if(a[i] != a[j])
					{
						flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
			if(flag==1)
			{
				count++;
				System.out.println(a[i]+"");
			}
		}


	}

}
