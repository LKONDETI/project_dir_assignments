package generics;

import java.util.HashMap;

public class holdKeyValue {

	
		public static void main(String[] args)
	    {
	        // Create an empty hash map by declaring object
	        // of string and integer type
	        HashMap<Integer, Double> map = new HashMap<>();
	  
	        // Adding elements to the Map
	        // using standard put() method
	        map.put(1, 0.1);
	        map.put(2, 0.2);
	        map.put(3, 0.3);
	        map.put(4, 0.4);
	        map.put(5, 0.5);
	        map.put(6, 0.6);
	        map.put(7, 0.7);
	        map.put(8, 0.8);
	        map.put(9, 0.9);
	        map.put(10, 0.001);
	       
	        System.out.println("Size of map is:- " + map.size());

	        System.out.println(map);
	    }
}
	  
	        
