package java_concept;

public class ConditionalOperatorsIFElse {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println(a > b);

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		if (false) { // Dead code
			System.out.println("Hii");
		} else { // Dead code
			System.out.println("Bye...");
		}

		//inside if else if there true or false it will always print it 
		
		
		
		
		
		
		String s = "Hello";
		String s1 = "hello";

		if (s.equalsIgnoreCase(s1)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");

		}

		int total = 100;
		int fee = 100;

		if (total == fee) {
			System.out.println("total is fee");
		} else {
			System.out.println("total is not fee");
		}

		if (12 == 12.22) {
			System.out.println("Hello");
		}

		// > < >= <= == !=
		int c = 2000;
		int d = 2000;
		if (d >= c) {
			System.out.println("PASS");
		}

		int balance = 101;
		if (balance != 100) {
			System.out.println("bal is not correct");
		}

		int marks = 200;

		if (marks >= 90) {
			if (marks <= 100) {
				System.out.println("PASS");

			} else {
				System.out.println("wrong marks");
			}
		} else {
			System.out.println("FAIL");
		}

		// WAP to find out the highest number where three different numbers are
		// given:
		int x = 500;
		int y = 600;
		int z = 300;
		// && - AND operator -- > Short Circuit Operator
		// || - OR -->
		if (x > y && x > z) {// false && true
			System.out.println("x is the greatest");
		} else if (y > z) {// true
			System.out.println("y is the greatest");
		} else {
			System.out.println("z is the greatest");
		}

		// WAP to check the browser value and then launch the respective
		// browser:
		
		//keep in the mind break keyword works inside for loop brackets and switch statement 
		// we cannot use it with if else statement

		String browser = "chrome";

		// 1. only if-else
		//this condition is only with if and at the end of the condition else 
		//the problem with this statement it doesn't mean if the condition is true it will still check another condition too then it will break 
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}

		if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		}

		if (browser.equals("ie")) {
			System.out.println("launch ie");
		}

		if (browser.equals("safari")) {
			System.out.println("launch safari");
		}

		else {
			System.out.println("please pass the correct browser name");
		}

		// 2. if-else  else-if
		//this condition is with if and else condition 
		//the problem with this statement
		// lets say the exact matching condition is coming at the of the statement it will check one by one until it finds the matched one 
		// then it will stop and break
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");

		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} else if (browser.equals("IE")) {
			System.out.println("launch IE");
		} else if (browser.equals("Safari")) {
			System.out.println("launch Safari");
		} else {
			System.out.println("please pass the correct browser name");
		}

		// 3. switch-case:
        // this statement is working with exact matching condition its not traveling among the condition it doesnt matter in what line comes the matching 
		//condition it will jump right into it 
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firfox":
			System.out.println("launch firefox");
			break;
		case "IE":
			System.out.println("launch IE");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("please pass the correct browser name");
			break;
		}

	}

}
