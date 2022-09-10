import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountDuplicateElements {

	public static void main(String[] args) {
		int[] arr= {2,2,3,3,3,4,5,1,6,7,4,2};
		//this is the given array from which we have to  
		//find the number of duplicate elements using different methods
		//first method: Using HashMap
        Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
        //the main idea is to store the elements as the key and its occurrence as value
        //As we know that HasMap store elements in Key value Pair and it avoids duplicacy
        for(int x: arr) {
        	if(!hm.containsKey(x)) {
        		hm.put(x,1);
        	}else {
        		hm.put(x,hm.get(x)+1);
        	}
        }
//        this for loop says that first traverse through each element in an array.we know in the starting the HashMap 
//        object has no key or value.so if statement reflect true at first because hm does not contain x key
//        so it enters the loop and put key and its occurrence as 1
//        and when the loops runs again and if the same key is available in hm object it enters the else loop and there it adds
//        its value as +1 which will be its occurrence.
        //now we have to iterate through hashmap for getting the occurrence value
        //there are two types of iteration in hashmap
        //1.entrySet
        //2.keySet
        Iterator<Integer> it=hm.keySet().iterator();
        int count=0;
        while(it.hasNext()) {
        	int key=it.next();
        	if(hm.get(key)>1) {
        		count++;
        	}
        }
        System.out.println(count);
        
        
        
        
        
	}

}
