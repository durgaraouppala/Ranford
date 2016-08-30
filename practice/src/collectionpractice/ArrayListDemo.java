package collectionpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ArrayListDemo {

	public static void main(String[] args) {
		Map<String, List<String>> map=new HashMap<>();			     
		  List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Ravi");//adding object in arraylist    
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");    
	
		  List<String> al2=new LinkedList<String>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Junaid");    
			   map.put("A", al);
			   map.put("B", al2);
			   for(Map.Entry<String, List<String>> entry : map.entrySet())
			   {
			   
				   System.out.println("Keys: "+entry.getKey());  
				   System.out.println("Values: "+entry.getValue());  
			   }
 


	}

}
