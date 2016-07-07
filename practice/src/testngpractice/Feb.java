package testngpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Feb {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		int a,b,n;
		n=Integer.parseInt(br.readLine());
		a=3;
		b=5;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<n;i++)
		{
			int c=a+b;
			if(c<=n)
			{
				System.out.println(c);
			}
			a=b;
			b=c;
		}

	}

}
