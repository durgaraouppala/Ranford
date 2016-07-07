package collectionpractice;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		Enumeration<String> Keys;
		String str1;
		Integer value;
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		ht.put("Durga", 22);
		ht.put("Mubeen",18);
		ht.put("Jyothibabu", 7);
		ht.put("Raju", 9);
		Keys=ht.keys();

		while(Keys.hasMoreElements())
		{
			str1=Keys.nextElement();
//			System.out.println(str1);
		}
		
		value=  ht.get("Durga").intValue();
//		ht.put("Durga", 17);
		System.out.println(value);

	}

}
