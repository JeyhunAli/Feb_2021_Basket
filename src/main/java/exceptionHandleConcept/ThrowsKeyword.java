package exceptionHandleConcept;

public class ThrowsKeyword {
/**
 * ThrowsKeyword is not for handling exception in java 
 * Throws is just a Keyword to pass the exception from one method to another 
 * 
 * this just another way of having throw keyword to pass another method and its another method responsiblity to handle it 
 * this is mostly used between different systems passing from one system to another and the other system is handlyng the exception 
 * 
 */
	public void m1() {
		m2();
	}

	public void m2() {
		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public void m3() throws ArithmeticException {
		int i = 9 / 0;
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Hi...");
	}

}
