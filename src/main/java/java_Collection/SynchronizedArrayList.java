package java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

/**
 * as we know that arraylist is non synchronized it means at the time multiple thread can access to the object
 * but there are ways to make arraylist synchronized so that at the time only one thread can access for that there are two ways 
 * 1. using Collections class with synchronizedList method in java 
 * note : with this method when do some operation on arraylist we dont need explicitly synchronization
 * but when we traverse the values from synchronized-arraylist we need to use explicitly synchronization below code 
 */
		// 1st way Collections.synchronizedList
		List<String> names = Collections.synchronizedList(new ArrayList<String>());
		names.add("Naveen");
		names.add("AliJeyhun");
		names.add("Emil");
		
		//explicitly synchronization while fetching the value
		synchronized(names) {
			Iterator<String> it = names.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		
		System.out.println("\n--------\n");
		// 2nd way in this way we dont need to use explicitly synchronization to get the value or to fetch 
		//the value from arraylist
		// CopyOnWriteArrayList by nature synchronized in java its thread safe
		//and even some operation like add/remove/traverse they dont need explicitly synchronization 
		
		CopyOnWriteArrayList<String> carsList = new CopyOnWriteArrayList<String>();
		
		carsList.add("Lexus");
		carsList.add("BMW");
		carsList.add("Toyota");
		
		Iterator<String> cars = carsList.iterator();
		
		while(cars.hasNext()) {
			System.out.println(cars.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
