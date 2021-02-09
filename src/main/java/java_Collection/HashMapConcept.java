package java_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		
		//part of Collection -- dynamic and its class implementing map interface
		//stores the values : key-value pair
		//can have only one null key another null key you can have multiple of them its not gonna throw compile time error 
		// but at the run time it will pick latest value
		//can have any number of null values 
		// hashmap stores the data on the form of key and value and its not order base 
		//we canot use for loop to get all the values from hashmap
		//3 ways of iteartion
		
		//1. for each loop with entry set
		
		Map<String, String> EmpMap = new HashMap<String, String>(); 
		//top casting 
		
		EmpMap.put("name", "Tom");
		EmpMap.put("ID", "101");
		EmpMap.put("city", "Bangalore");
		EmpMap.put("country", "IN");
		EmpMap.put(null, "1000");
		EmpMap.put(null, "2000");
		EmpMap.put("age", null);
		EmpMap.put("phone", null);
		EmpMap.put("country", "UK");
		EmpMap.put("countryEver", "Azerbaijan");

		
		
		System.out.println(EmpMap.get("name"));
		System.out.println(EmpMap.get("country"));
		System.out.println(EmpMap.get("salary"));//null if there are no key
		System.out.println(EmpMap.get("countryEver"));

		System.out.println(EmpMap.get(null));
		System.out.println(EmpMap.get("age"));
		
		//entrySet: to fetch all keys-values:
		for(Map.Entry<String, String> entry : EmpMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() +  " value = " + entry.getValue());
		}

		System.out.println("----");
		
		//keySet(): for getting the keys:
		for(String s : EmpMap.keySet()) {
			System.out.println("key = " + s);
		}
		
		System.out.println("----");

		
		//values(): for getting the values:
		for(String v: EmpMap.values()) {
			System.out.println("value = " + v);
		}
		System.out.println("----");

		
		//Lambda:
		EmpMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
		
		
		
	}

}
