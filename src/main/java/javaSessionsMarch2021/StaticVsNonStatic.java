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
 *  separeted memory storage for static variables from static changed to dynamic in permanenet gen 
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
 *  we cannot declare class itself as static 
 *  the reason is its all related object creation because object cannot hold static 
 *  stuff 
 *  i would say declaring class as static is vialotion of object oriented programming lang 
 *  
 *  any method it does not matter static or non static can be overloaded 
 *  
 *  but static method cannot be overriden 
 */

public class StaticVsNonStatic {
	
	String name;
	static int age;
	
	public void getInfo() {
		System.out.println("get info.....");
	}
	
	public static void sendMail() {
		System.out.println("send mail...");
	}

	public static void main(String[] args) {

		StaticVsNonStatic obj = new StaticVsNonStatic();
		//non static stuff:
		obj.name = "Tom";
		System.out.println(obj.name);
		obj.getInfo();
		
		//static stuff:
		//no need to use object:
		//1. direct calling:
		age = 30;
		System.out.println(age);
		sendMail();
		//2. by class name:
		System.out.println(StaticVsNonStatic.age);
		StaticVsNonStatic.sendMail();
		
		System.out.println(0.1+0.2);
		
	}

}