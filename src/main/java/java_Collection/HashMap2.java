package java_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {


		 Map <String, Integer> map = new HashMap<String, Integer>();
		 
		 map.put("apple", 10);
		 map.put("pear", 11);
		 map.put("strowberry", 12);
		 map.put("lemon", 15);
		 map.put("banana", 20);
		 map.put("grape", 30);
		 map.put("dates", 50);
		 map.put("orange", 17);
		 map.put("cucumber", 10);
		 
		 //1. to iterate all the values from hashmap we use for each loop with entry set 
		 for(Map.Entry<String, Integer> entryPoint: map.entrySet()) {
			 System.out.println(entryPoint.getKey() + " " + entryPoint.getValue());
			 
		 }
		
		 //2. only printing key  with the function keyset
		 System.out.println("-------------");
         for(String s: map.keySet()) {
			 System.out.println("keys are: "+ s);
		 }
		 
		 //3. only printing values with value function
		 System.out.println("-------------");
		 for(Integer v: map.values()) {
			 System.out.println("values are: " + v);
		 }
		 
		 //4. after jdk 1.8 lampda is there 
		 //foreach function then put () inside bracket k,v then print it very simple  
		 map.forEach((k,v) -> System.out.println("key is: " + k + " - value is: " + v));
		
		
		
	}

}
