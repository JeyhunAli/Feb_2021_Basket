package OOP_Abstract;

/**
 * 
 * @author jey
 * Abstract class with Abstract keyword
 * Abstract class can have Abstract method explicitly need to mention about Abstract keyword while creating method
 * we can not create object of Abstract class
 * Abstract class can have Abstract methods(with body) And Non Abstract  methods(with body)  
 * 0 % Abstraction 
 * partial Abstraction
 * 100% Abstraction is possible in Abstract class 
 * but in ineterface we cannot have 0 % Abstraction 
 * we can create Constructor of Abstract class 
 * as soon as we are extending our Abstract class then we are overriding all the methods from Abstract class 
 * we can override non Abstract methods as well 
 * but if the methods are final or static those methods we cannot override 
 * when we create child class object 
 * that constructor will be called 
 * first preference will be given to the Constructor 
 * lets say in our Abstract class we have constructor
 * also we have lets say login page it has constructor too 
 * at time of testing our login page in separate class we create object of login page 
 * then both the constructor will be call 
 * first preference will be given to the Abstract class constructor then login page constructor
 * in Abstract class same concept as interface refernce type cheking is applied
 *
 */

public abstract class abstractConcept {
	
	

}
