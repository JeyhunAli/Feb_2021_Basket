package java_concept;

public class Object_Class_car {
	
	// class vars://global vars
				String name;
				String color;
				int price;
				String model;


	public static void main(String[] args) {

		/**
		 * object is always creating from class class is first 
		 * this means object is blueprint of the class basically copy of the class 
		 * once we create the object of the class all the class var will be given to that particular object
		 * we can create multiple object from same class 
		 * but object reference name has to be different
		 * 
		 * when declaring the class variables it better not to provide any value 
		 * value has to given inside object creating
		 * 
		 * 
		 * when u create object it will store in the heap memory
		 * ref name of object will store in stack memory
		 * class var will be store inside heap memory
		 * local var will be store inside stack memory
		 * 
		 * stack means last in first out lifo concept
		 * reverse of the stack memory is QUEUE
		 * queue is first in first out fifo
		 * 
		 * classes always are the template in java 
		 * object is blueprint of the class based on class var we have some property to access
		 * 
		 * main method is part of the stack memories
		 * 
		 */
	
			
				int i = 10;
				// create an object: using new keyword

				Object_Class_car c1 = new Object_Class_car();

				c1.name = "BMW";
				c1.color = "Blue";
				c1.price = 80;
				c1.model = "520d";

				Object_Class_car c2 = new Object_Class_car();
				c2.name = "AUDI";
				c2.color = "White";
				c2.price = 75;
				c2.model = "Q5";

				System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + c1.model);
				System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + c2.model);
				
				//no reference objects:
				//this is the useless one of using creating object disadvantages are to use like that u have to create so many objects
				//of each class var anf it will use a lot of memory 
				// another disadvantages is poor performance
				//and when is going to be full of the memory jvm will call garbage collector 
				//and gc will destroy those objects which has not ref name 
				// gc is only for heap memory its not for stack memory
				new Object_Class_car().name="Honda";
				new Object_Class_car().model = "civic";
				
				//Null Reference Object:
				Object_Class_car c3 = new Object_Class_car();
				
				c3 = null;
				
				//System.gc();


		
	}

}
