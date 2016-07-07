package collectionpractice;
import java.util.HashMap;
import java.util.Set;
 
public class MyHashMapKeys {
     
    public static void main(String a[]){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        //add key-value pair to hashmap
        hm.put(1, "FIRST INSERTED");
        hm.put(2, "SECOND INSERTED");
        hm.put(99,"THIRD INSERTED");
//        System.out.println(hm);
        Set<Integer> keys = hm.keySet();
        for(Integer key:keys)
        {
//        	System.out.println(key);
              
        if(key.equals(99))
        {
        	System.out.println(key);
        }
       
        }
        
    }
}

