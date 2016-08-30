package practice;

public class StringFunctions {
	public static void main(String[] args) {
	
		String input="1234";
		int res=0;
		String[] dig=input.split("");
//		System.out.println(dig);
		for(int i=0;i<dig.length;i++)
		{
			String a=dig[i];
			System.out.println(a);
			int num=Integer.valueOf(a);
			System.out.println(num);
			res=res+num;

		}
		
		System.out.println(res);
		
		
		
		
	}

}
