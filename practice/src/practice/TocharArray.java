package practice;

public class TocharArray {
	 
    static void reverseEachWordOfString(String inputString)
    {
    	
    	String[] s=inputString.split("");
    	
    	for(int i=1;i<inputString.length()+1;i++)
    	{
    		String s1=s[i];
    		
    		if(s1.toUpperCase().equals(s[i]))
    		{
    			String s2=s1.toLowerCase();
    			System.out.print(s2);
    			
    		}
    		else
    		{
    			String s3=s1.toUpperCase();
    			System.out.print(s3);
    		}  		
    		
    	}
    	    	
    }
     
    public static void main(String[] args) 
    {
        reverseEachWordOfString("StRiNg");
         
    }
	}


