package javaSessionsMarch2021;

/**
 * 
 * @author jey
 * 
 * 
 *         //12. What is the constructor? // A constructor is a special type of
 *         the method that is primarily used to initialize an object property.
 *         //The name of the constructor must be same as the class name;
 *         constructor cannot have a return type. //A class can have multiple
 *         constructor with different number of parameters or different type of
 *         the parameters. //because of that constructor can be consider as
 *         constructor overloading //constructor is independent for that we
 *         cannot create a constructor inside of the method //Constructor most
 *         usually used to initialize the instance variable. There two type of
 *         the constructor //1. Default constructor, 2. parametrized
 *         constructor. Default constructor it means there’s parenthesis but no
 *         arguments no parameters //inside of the parenthesis. Parametrized
 *         constructor is with the arguments with the parameter. //The purpose
 *         of constructor is to initialize the object of a class while the
 *         purpose of a method is to perform a task by executing java code.
 *         //Constructors cannot be abstract, final, static and synchronized
 *         while methods can be. Constructors do not have return types while
 *         methods do. // Constructor is similar to the method but it’s really
 *         not method completely different from each other. //Constructor is
 *         used to initialize an object whereas method is used to indicate
 *         functionality of an object. //Constructors are invoked implicitly
 *         whereas methods are invoked explicitly. ... Constructor should be the
 *         same name as class. //but method can be any other name. //constructor
 *         calls on its on we don’t need to explicit any other method. //one
 *         more thing for the constructor if we give some value some arguments
 *         //Let’s say we have 2 constructors in one class we can call one
 *         constructor inside to another constructor for that we have to use
 *         this keyword
 * 
 * 
 *         /** CONSTRUCTOR comes to the picture lets say we have class variables
 *         and we have to use them multiple time so everytime need to create
 *         property of that i mean need to create object then access to do it
 *         very efficient way is with constructor
 * 
 *         when u are creating that particular class object if it has
 *         constructor it will automatically call in constructor we use this key
 *         word to differentiate local and global variable
 * 
 *         if the class variable declared as static u cannot create same
 *         property inside of the constructor its not allowed basically u cannot
 *         use static class variables inside the constructor
 * 
 *         in one class i can have multiple constructor but when i create that
 *         class object in another class it gives me otion which constructor do
 *         you wabt to implement
 * 
 *         the reason to have multiple constructor some constructor can have all
 *         the class var properties some constructor default some constructor
 *         with limited var
 * 
 *         constructor is usually public so i can access in another class but if
 *         its private i can use it only within the class
 * 
 *         constructor overloading is possible within class
 * 
 *         in constructor no void no return keyword are allowed
 *         
 *         if we have multiple constructor in same class one default one with one paramater
 *         another is two parameter at the time of cretion object
 *         if we dont pass any argument jvm will pick default constructor 
 *         
 *         practical experience using constructor overloading 
 *         for example each and every constructor different type of access to the login page 
 *         some of them with the mail adress 
 *         some of them with the name and phone number 
 *         or for negative test cases passing wrong information and so on 
 *         
 *         
 */




public class ConstructorConcept {
	
	String name1;
	int dose1;
	String name2;
	int dose2;
	String name3;
	int dose3;
	
	/**
	 * @param name1
	 * @param dose1
	 * @param name2
	 * @param dose2
	 * @param name3
	 * @param dose3
	 */
	
	public ConstructorConcept(String name1, int dose1, String name2, int dose2, String name3, int dose3) {
		super();
		this.name1 = name1;
		this.dose1 = dose1;
		this.name2 = name2;
		this.dose2 = dose2;
		this.name3 = name3;
		this.dose3 = dose3;
	}


	public static void main(String[] args) {
		
		ConstructorConcept cons = new ConstructorConcept("JJ", 1, "moderna", 2, "pfizer", 2);
		System.out.println(cons.dose1);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
