package exceptionHandleConcept;

public class TryCatchBlock {
	String name = "Tom";

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
			TryCatchBlock obj = new TryCatchBlock();
			//obj = null;
			System.out.println(obj.name);
			
			System.out.println("Hi");
			System.out.println("Hi");   
			System.out.println("Hi");
			/**
			 * IF WE WRITE EVEN THOUSAND LINE OF THE CODE INSIDE TRY BLOCK IT WONT EXECUTE
			 * because we surrond code with try catch block to prevent any exception
			 * 
			 * once we have ArithmeticException e it will internally create object by the ref name e we can access some methods 
			 * one them e.printStackTrace(); it will print in which method which class overrol info 
			 * this method not terminating our execution its just warning us with exact exception and exact line of code that exception happened
			 * 
			 * ArithmeticException extending runtime exception and runtime exception extending parent class exception 
			 * and parent of the exception is Throwable class 
			 * Throwable class  implementing Serializable interface 
			 * we cannot handle exception with errors 
			 * we can have multiple catch block with single try block 
			 * its always good practice to mention exception name 
			 * because the code reviewer can understand 
			 * 
			 */

		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception is coming....");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("NPE exception is coming....");
			e.printStackTrace();
		}
		

		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}