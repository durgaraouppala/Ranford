package collectionpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Keyset {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "First Element");
		m.put(2, "Second Element");
		
		
		Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
	    Iterator<Map.Entry<Integer, String>> i = entrySet.iterator();
	    while(i.hasNext()){
	        Map.Entry<Integer, String> element = i.next();
	        System.out.println("Key: "+element.getKey()+" ,value: "+element.getValue());
	    
	    }
	    
	}

}
