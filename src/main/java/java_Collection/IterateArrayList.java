package java_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import utility.ConsoleColors;



public class IterateArrayList {

	public static void main(String[] args) {

		//ways of the iterating ArrayList
		
		
		  ArrayList<String> al = new ArrayList<String>();
	      System.out.println("Initial size of arraylist: " + al.size());

	      // add elements to the array list
	      al.add("Jeyhun");
	      al.add("Gelmishdun");
	      al.add("Lenkarana");
	      al.add("dunen");
	      al.add("seni");
	      al.add("gordum");
	      al.add("BulagBashinda");
	      al.add("Elinde Cay");
		
	      
	      // 1 typical for loop
	      for(int i=0; i<al.size(); i++) {
	    	  System.out.println(ConsoleColors.FOREST_GREEN + al.get(i));
	      }
	      
	      System.out.println(ConsoleColors.ORANGE + "===============");
	      
	      
	      //2 for each loop
	      for(String s: al) {
	    	  System.out.println(ConsoleColors.CYAN +s);
	      }
	      
	      System.out.println(ConsoleColors.ORANGE + "===============");

	      // 3 after jdk 8 lamda 
	      
	      al.stream().forEach(myActions -> System.out.println(ConsoleColors.FOREST_GREEN +myActions));
	      
	      // 4 iterator
	      
	      System.out.println(ConsoleColors.ORANGE + "=============");

	      
	      Iterator<String> it = al.iterator();
	      while (it.hasNext()) {
	    	  System.out.println(ConsoleColors.FOREST_GREEN + it.next());
	      }
	      
	      System.out.println(ConsoleColors.ORANGE + "=============");
	      
	      // another way of declaration of arraylist
	      ArrayList<Integer> intt = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60,70));
	      System.out.println(intt);
	      System.out.println(ConsoleColors.BLUE + (intt.size()));
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
		
	}

}
