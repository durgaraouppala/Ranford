package practice;
public class Demo {
	    public int[] removeDuplicates(int[] arr) { 
	        int end = arr.length;

	        for (int i = 0; i < end; i++) {
	            for (int j = i + 1; j < end; j++) {
	                if (arr[i] == arr[j]) {                  
	                    int shiftLeft = j;

	                    for(int k = j + 1; k < end; k++, shiftLeft++) {
	                        arr[shiftLeft] = arr[k];
	                    }

	                    end--;
	                    j--;
	                }
	            }
	        }

	        int[] whitelist = new int[end];

	        for (int i = 0; i < end; i++) {
	            whitelist[i] = arr[i];
	        }

	        return whitelist;
	    }
	
public static void maiin(String[] args)
{
	Demo d=new Demo();
	
	int[] arr2={2,5,7,9,9,11,12,5};
		d.removeDuplicates(arr2);
}
}

