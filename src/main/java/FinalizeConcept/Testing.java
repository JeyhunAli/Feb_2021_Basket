package FinalizeConcept;

/**
 * * @author jey
* finalize() is the method already available in Object class 
* and objecr class is the super class of all the classes 
* finalize method is already available in java inside the object class 
* and without extending we can override that method with @override keyword
* 
*  finalize() is the method which is going to execute just before garbage 
* collector is going to destroy the no or null reference object
 If we need to do any clean up activity before garbage collector
for example delete the data close the database connection 
and also when executing the java code without calling finalize method inside main method it will call automatically 
before Sysytem.gc method
finalize method will be called if specific class has that finalize method then it will call and befpre system.gc
but lets say we are from different clsss trying to call finalize method by creating that class object then refering it as null 
but that specific class hasnot finlalize method 
it wont call that method as long as u dont have finalize method inside class 

 * 
 * 
 *
 */

public class Testing {

	public static void main(String[] args) {

		Testing t = new Testing();
		t = null;
		
		Selenium s = new Selenium();
		s = null;
		
		System.gc();
		System.out.println("testing is done....");
	}
	
	@Override
	public void finalize() {
		System.out.println("Testing -- finalize method....");
	}
	

}
