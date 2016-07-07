package practice;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateStrings {

	public static void main(String[] args) {
	        String str = "settings";
	        removeDupWord(str);
	    }

	    public static void removeDupWord(String input) {
	        List<String> list = Arrays.asList(input.split(""));
	        System.out.println(list);
	        Set<String> lhs = new LinkedHashSet<String>(list);
	        System.out.println(lhs);
	        
	        for(String s : lhs) {
	        	
	            System.out.print(s);
	        	
	        }                   
	    }
 }
	

