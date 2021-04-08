package javaSessionsMarch2021;

public class ClassAndObjects {
	//class -- its a blueprint/template/category for all the objects
	//object -- its a physical entity of the class
	//its an instance of the class
	//data members --> method, class variables
	
	/**
	 * some common class properties for entire class its better to declare them with their own values in class level 
	 * this is the way we are avoiding to define same values over and over again 
	 * and it also helping to save more memory capacity 
	 * and of course its more helping performance of our script 
	 * object cannot hold any static var in java 
	 * when we create object it will store in heap memeory in java and reference pf the object will store inside 
	 * stack memeory 
	 * but static var will be store in CMA/Meta Space/ permanent generation 
	 * non static var will be store in heap memory 
	 * CMA - STANDS FOR  common memeory allocation 
	 * up to jdk 1.7 CMA USED TO CALL -->> Meta Space
	 * AFTER JDK 1.8 CMA CALLS PERMANENT GENERATION
	 * DIFFERENCES BETWEEN Meta Space AND Permanenet Generartion is 
	 * Permanenet Generartion memeory allocation is dynamic if its getting full its icreasing dynamicly 
	 * and it takes more memory from machines ram 
	 * 3 ways to access static var 
	 * by class name 
	 * by reference name --- >> it will give some error and its not recommended 
	 * direct access 
	 * heap memeory is divided few parts 
	 * young generartion  where object stores after creation 
	 * eden Space 
	 * survivor 1
	 * survivor 2 
	 * once young gen get a lot of object then it will move to eden space and 
	 * when eden space is also full its moving to s1 and s2 
	 * 
	 * all the local var will be store in stack memory 
	 * static is only for class var not local
	 * as soon as we declare local var as static we will get error
	 * but final is allowed it means we can declare local var as final 
	 * object will hold only non static var and method 
	 * static var and methods will be store only in CMA
	 * main method also will store in CMA because its static in Nature 
	 * to access static var and static method no need to create object 
	 * we can do it direct access 
	 * by class name 
	 * 
	 */

	int age;//class var
	String name;
	
	public static void main(String[] args) {

		int i = 10;//local var
		System.out.println(i);
		
		ClassAndObjects obj = new ClassAndObjects();
		
		obj.name = "Tom";
		obj.age = 25;
		System.out.println(obj.name + " " + obj.age);
		
		ClassAndObjects obj1 = new ClassAndObjects();
		obj1.name = "peter";
		obj1.age = 30;
		System.out.println(obj1.name + " " + obj1.age);
		
		ClassAndObjects obj2 = new ClassAndObjects();
		System.out.println(obj2.age);


		
	}

}