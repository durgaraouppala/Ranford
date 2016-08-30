package collectionpractice;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) {
		List<String> lis=new ArrayList<String>();
		lis.add("apple");
		lis.add("orange");
		lis.add("ball");
		String[] s=lis.toArray(new String[1]);
		for(int i=0;i<lis.size();i++)
		{
			String contents=s[i];
			System.out.println(contents);
		}
		
	}

}
