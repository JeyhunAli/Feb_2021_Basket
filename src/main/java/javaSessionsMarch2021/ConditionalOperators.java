package javaSessionsMarch2021;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 100;
		int b = 20;

		System.out.println(a == b);

		if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		if (a >= b) {
			System.out.println("a is gr than b");
		} else {
			System.out.println("b is gr than a");
		}

		// here we have var based on that positive negative condition and no dead code
		boolean flag = false;
		if (flag) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// here theres no var and only one condition thats why not satisfied code
		// becoming dead code
		if (false) {
			System.out.println("Hii");
		} else {// Dead code
			System.out.println("hello....");
		}

		System.out.println("hiiii");

		/**
		 * The main difference between the .equals() method and == operator is that one
		 * is a method and the other is the operator. We can use == operators for
		 * reference comparison (address comparison) and .equals() method for content
		 * comparison. In simple words, == checks if both objects point to the same
		 * memory location whereas .equals() evaluates to the comparison of values in
		 * the objects.
		 */

//		< > <= >= == !=
//		 if - if - if - if ....if
/**
 * this version is not recommended because 
 * if - if - if - if ....if
 * even if first condition satisfied 
 * compiler will go and check all the condition unnecesessary 
 * time 
 */
//		String browser = "chrome";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		
//		if(browser.equals("IE")) {
//			System.out.println("launch IE");
//		}
//		
//		if(browser.equals("Safari")) {
//			System.out.println("launch Safari");
//		}

//		else {
//			System.out.println("please pass the right browser name....");
//		}

		
		
		
		/**
		 * but in this condition is works perfectly fine 
		 * only one thing here lets say u one condition which is coming 
		 * at the end of condition here is safari 
		 * this statement it will check all the condition till end it wont jumb right into it 
		 */
		// if - else if -- else if

		String browser = "safari";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}

		else if (browser.equals("firefox")) {
			System.out.println("launch firefox");

		}

		else if (browser.equals("IE")) {
			System.out.println("launch IE");

		}

		else if (browser.equals("safari")) {
			System.out.println("launch safari");

		}

		else {
			System.out.println("Please pass the correct br name ... " + browser);
		}

	}

}