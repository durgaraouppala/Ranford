package collectionpractice;

public class StringRepeate {
	
	public String reverseRepeateString(String inputString)
	{
		String str="";
		int inputStringlen=inputString.length();
		String inputString1[]=inputString.split("");
		for(int i=inputStringlen;i>=0;i--)
		{
//			System.out.println(inputString1[i]);
			str=inputString1[i];
			
			for(int j=0;j<=inputStringlen;j++)
			{
				System.out.println(inputString1[j]);
				
			}
		}
		return str;
	}

	public static void main(String[] args) {
		StringRepeate str=new StringRepeate();
		str.reverseRepeateString("Java");

	}

}
