package java_Collection;

import java.util.ArrayList;

public class VirtualcapasityArraylist {

	public static void main(String[] args) {

		
		//virtual capasity of arraylist is 10 by default
		//but actual fysical cap is 0
		
		//if you want to see virtual cap 
		//for that we have to debugg the program then hover on arraylist ref name then you will see 
		// make sure expanding the window
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());

		ar.add(100);
		
		System.out.println(ar.size());

		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		
		
		ar.add(600);
		
		System.out.println(ar.size());
		
		
		//WE CAN INCREASE OR decrease virtual cap of arraylist after creating object pass the number 
		// for example
		ArrayList<String> st = new ArrayList<String>(20);
		
		st.add("Jeyhun");
		
		
		
		
	}

}
