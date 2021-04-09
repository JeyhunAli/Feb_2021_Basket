package java_Collection;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		
		  // create an object of array list
		// this is row type arraylist because we can add all the type data type and we will get yellow warning 
		//virtual capacity by default is 10 in arraylist but we can change it to another number 
		//for example  ArrayList al = new ArrayList<>(20);
		
		
	      ArrayList al = new ArrayList<>();
	      System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add(77);
	      al.add('i');
	      al.add(77.9);
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      al.add(2);
	      
	   
	      System.out.println("Size of al after additions: " + al.size());
	      System.out.println("in the second position is: " + al.get(2));
	  //    System.out.println(al.get(8));     java.lang.IndexOutOfBoundsException: 
	  //    negative indexing also           java.lang.IndexOutOfBoundsException: 

	      
	      // display the array list
	      System.out.println("Contents of al: " + al);

	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);
	      
	      
	      
	      
	      
	      //generics array with object type here also we can store all kind data and no any warnings
	      ArrayList <Object> al1 = new ArrayList<Object>();
	      System.out.println("Initial size of al: " + al.size());

	      
	      al1.add("C");
	      al1.add(77);
	      al1.add('i');
	      al1.add(77.9);
	      al1.add("D");
	      al1.add("F");
	      al1.add(1, "A2");
	      al1.add(2);
	   
	      System.out.println("Size of al after additions: " + al1.size());
	      System.out.println("in the second position is: " + al1.get(2));
	  //    System.out.println(al.get(8));     java.lang.IndexOutOfBoundsException: 
	      
	  //    negative indexing also           java.lang.IndexOutOfBoundsException: 

	      
	      // display the array list
	      System.out.println("Contents of al: " + al1);

	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al1.size());
	      System.out.println("Contents of al: " + al1);
	      
	      System.out.println(al1.size()-1); //higest index
	      System.out.println(0);  // lowest index
	      
	      
	      
	      
	      
	      
	      
	      
	      
	   }
		
	}












/**
 * ArrayList if we dont define any generics its row type we can add any kind data type
 * ArrayList is maintane the order 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */