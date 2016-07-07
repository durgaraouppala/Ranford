package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,n,b;
		System.out.println("Enter the number:");
		n=Integer.parseInt(br.readLine());
		System.out.println("the fibonacci series is:");
		a=3;
		b=5;
		System.out.println(a);
		System.out.println(b);
		for(int c=3;c<n;c++)
		{
			c=a+b;
			if(c<=n)
			{
				System.out.println(c);
			}
			a=b;
			b=c;
		}
		

	}

}
