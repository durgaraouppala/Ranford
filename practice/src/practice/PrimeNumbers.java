package practice;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n;
		int status=1;
		int num=3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number up to the given range:");
		n=scan.nextInt();
		if(n>=1)
		{
			System.out.println("First"+n+"prime numbers are:");
			System.out.println(2);
			
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=Math.sqrt(num);j++);
			{
				
				int j=2;
				if(num % j ==0)
				{
					status=0;
					break;
				}
				if(status != 0)
				{
					System.out.println(num);
					i++;
				}
				status=1;
				num++;
			}
		}

	}

}
