package javaSessionsMarch2021;

/**
 * 
 * @author jey
 *  java memory -->> heap and stack 
 *  when we are creating object that object stores in heap memeory 
 *  heap memory its only for non static class var and non static methods 
 *  but reference of that object stores in stack memory, along with that all the local variables will store in stack 
 *  all the class variables stores in heap memory 
 *  but if we have static declared variables in class var they are stores in different place 
 *  name of that location is 
 *  CMA (commom memory allocation), META_SPACE, PERMANENT GENERATION 
 *  CMA (commom memory allocation) -> STATIC variables are common for all the methods thats why name is suggestion
 *  META_SPACE -> upTO jdk 1.7 name is this
 *  after jdk 1.8 name is PERMANENT GENERATION
 *  differences between META_SPACE and PERMANENT GENERATION are 
 *  separeted memory storage for java static variables from static changed to dynamic in permanenet gen 
 *  
 *  to acces static var 3 ways 
 *  by class name 
 *  by reference name
 *  and directly 
 *  best way to access class var specially static var its by class name 
 *  
 *  heap memory divided into 3 stage 
 *  young generartion  --> where all the new created objects stores 
 *  Eden space --> when young generartion getting full some of the object moves here 
 *  Survivor_1 survivor_2 --> all the non destryod object by garbage collector throughout execution 
 *  will store here 
 *
 *  Garbage collector will destroy those objects which have not object reference or they have null reference 
 *
 *  another concept with static class var is 
 *  we have to declare them as final because its possible to change the value of static class var to different value 
 *  if its not declared as final 
 *  final keyword is use to provide constant values 
 *  
 *  we cannot declare local var as static its not allowed in java 
 *  it will throw an error illegal access modifier 
 *  but we can declare local var as final its allowed 
 *  
 *  java is platform independant 
 *  but jvm is platform dependant
 *  
 *  any method it does not matter static or non static can be overloaded 
 *  
 *  but static method cannot be overriden 
 *  
 *  static bloc will store in cma common memery allocation 
 *  
 *  to create static class in java is not allowed its because object creation 
 *  
 *  
 */

public class Car {
	//class  vars
	String name;
	int price;
	String color;
	static final int wheels = 4;
	

	public static void main(String[] args) {

		final int days = 7;//local var
		System.out.println(100 * days);
		
		Car c1 = new Car();
		c1.name = "Audi";
		c1.price = 70;
		c1.color = "White";
		
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + Car.wheels);
		System.out.println(c1.wheels);//Not Recommended 
		System.out.println(wheels);//direct calling
		
		
		Car c2 = new Car();
		c2.name = "Honda";
		c2.price = 20;
		c2.color = "Blue";
		
		Car c3 = new Car();
		c3.name = "BMW";
		c3.price = 60;
		c3.color = "Red";
		
		
		
		
	}

}