package javaSessionsMarch2021;

public class MainMethodOverloading {

	/**
	 * 
	 * @param 
	 * we can overload main method with different paramaters 
	 * but u have to call those method into actual main method 
	 * 
	 * main method is void in nature bacause its never returning anything
	 * main method is static in nature bacause jvm doesnt need create object to call main method 
	 * its static everything inside main method will execute automatically 
	 * any method it does not matter static or non static can be overloaded 
	 * but static method cannot be overriden 
	 */
	public static void main(String naveen[]) {
		System.out.println("hello world");
		
		main(10);
	}
	
	public static void main(int a) {
		System.out.println("hello world" + a);

		System.out.println(a);

	}
	
	public static void main(int a, int b) {
		System.out.println("hello world" + a+b);

		System.out.println(a+b);

	}
	
	

}
