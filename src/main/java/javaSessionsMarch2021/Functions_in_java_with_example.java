package javaSessionsMarch2021;

public class Functions_in_java_with_example {

	// WAF - ip: student name(String)
	// return : marks (int)

	/**
	 * 
	 * @param studentName
	 * @return
	 * 
	 * main method is void in nature because main method is never returning any value 
	 * 
	 * if inside particular method there is a condition and that condition is returning something 
	 * even we change the return type pf that method to specific data type it will still throw error 
	 * why because its asking add another return type for method 
	 * 
	 * integer cannot return null instead we can write some negative number
	 * in return statement once condition is satysfied  its not going to check each and every condition 
	 * 
	 * we can have method in java with void 
	 * and return type together just ; 
	 * we call this method return type will be void in nature 
	 * 
	 */
	
	
	//this statement is improved but still some ares need to be improve 
	//here if the student name is Sri it the condition will keep checking entire if else statement to reach sri 
	// its not directly jumping on to the condition of where the name equal to Sri
	public int getStudentMarks(String studentName) {
		System.out.println("student name is : " + studentName);

		int marks = -1;

		if (studentName.equals("Asif")) {
			marks = 90;
		} else if (studentName.equals("Pavan")) {
			marks = 80;
		} else if (studentName.equals("Sri")) {
			marks = 95;
		} else {
			System.out.println("student not found..." + studentName);
		}

		return marks;

	}
	
	//this method type not improved and not recomended
	//this method has return type for each condition unnecessary
	//here break statement not allowed
	public int getStudentMarksNotRecommended(String studentName) {
		System.out.println("student name is : " + studentName);

		if (studentName.equals("Asif")) {
		    return 90;
		} else if (studentName.equals("Pavan")) {
			return 80;
		} else if (studentName.equals("Sri")) {
			return 95;
		} else {
			System.out.println("student not found..." + studentName);
		}
		return -1;

		

	}
	
	public static void getChidrensMarks(String childrenName) {
		
		switch (childrenName) {
		case "Emiliya":
			System.out.println("the marks is 100 of " + childrenName);
			break;

		case "Adam":
			System.out.println("the marks is 99 of " + childrenName);
			break;
			
		case "Valeriya":
			System.out.println("the marks is 99.0 of " + childrenName);
			break;
		default:
			System.out.println("not fount " + childrenName);
			break;
		}
		
	}

	// WAF -- give me the browserName (String) -- input
	// and then launch the browser
	// an return the browser name (String)

	public String launchBrowser(String browserName) {
		System.out.println("starting browser: " + browserName);

		switch (browserName) {
		case "chrome":
			System.out.println("launch chrome");
			return "chrome";

		case "firefox":
			System.out.println("launch ff");
			return "firefox";

		case "IE":
			System.out.println("launch ie");
			return "IE";

		case "safari":
			System.out.println("launch safari");
			return "safari";

		default:
			System.out.println("plz pass the correct browser name " + browserName);
			//we can returm here null as well because default value of string is null
			return "INVALID_BROWSER_NAME 404 NOT FOUND";
		}
		
		
	}
	
	
	//switch case and if-elseif
			// WAF -- give me the browserName (String) -- input
			// and then launch the browser
			// an return the browser version (double)
	
	//here deleting from each case return and 
	// returning at the end the given value is not correct way
	public double getBrowserVersion(String bbrowserName) {
		double browserV = 0;
		
		switch (bbrowserName) {
		case "chrome":
			System.out.println("the version of chrome is: " + bbrowserName);
			browserV = 86.6;
			return browserV; 
		case "safari":
			System.out.println("the version of safari is: " + bbrowserName);
			browserV = 45.5;
			return browserV;
		case "firefox":
			System.out.println("the version of firefox is: " + bbrowserName);
			browserV = 99.7;
			return browserV;
		case "IE":
			System.out.println("the version of IE is: " + bbrowserName);
			browserV = 66.8;
			return browserV;

		default:
			System.out.println("PLZ PASS CORRECT BROWSER" + bbrowserName);
			
			return browserV;
		}
		
	}
	
	
	

	public static void main(String[] args) {

		getChidrensMarks("Adam");
		
		Functions_in_java_with_example obj = new Functions_in_java_with_example();
		int m1 = obj.getStudentMarks("naveen");
		System.out.println(m1);
		
		String br = obj.launchBrowser("chrome");
		System.out.println(br);
		
		double browserVersion = obj.getBrowserVersion("safari");
		System.out.println(browserVersion);
	}

}
