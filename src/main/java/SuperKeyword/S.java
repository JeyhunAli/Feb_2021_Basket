package SuperKeyword;

/**
 * super keyword can call constructor
 * var overriding not possible 
 * var hiding is possible
 * if u want to accces parent class var we can use super keyword
 * 
 * 
 * super()
	
 Super keyword is used call parent methods, parent variables and also for parent class constructor
 Super keyword is used to call parent class properties without creating the objects of parent class
 Super keyword should be the first statement in your constructor
 We cannot call all the constructor with super (),we can call only one constructor with super (because super should be the first statement)
 With super() immediate parent constructor will be called
lets say our parent class also has its own parent super class but in our child class once we have super keyword snd we want to call parent 
class properties it will call only immediate parent not grand parent or grand super one 
 Super() class constructor should be called from child class constructor only ,we cannot call from methods
in test class we cannot use super keyword 
 */

public class S {

}
