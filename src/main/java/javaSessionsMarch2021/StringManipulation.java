package javaSessionsMarch2021;
/**
 * 
 * @author jey
 * String is class in java its collection of characters 
 * lowest index always zero 
 * highest index length()-1
 * In String manipulation operation while we are dealing we can see 
 * some inbuilt method overloading examples for example 
 * indexOf() is overloaded method with different parameters 
 * this method is used for getting specific index of any character in string 
 * if with this method we trying to fo find out the index of String which is not existing in given String 
 * it will return -1 
 * 
 * trim() method will remove spaces only from the corners of the strings 
 * not the spaces between words 
 * 
 * replace() method is used to replace the charcters spaces between string
 * 
 * toLowerCase
 * toUpperCase these two methods is used to convert given String to upper or lower letters 
 * 
 * substring() method will give us the exact portion of string
 * 
 * split() method in java is used split the given string on the basis of underscore or dot or space or anything between string
 * and return type of String split method is String array [] 
 * why we are getting return type array of split method 
 * as name suggest this method is Spliting the given string into multiple pieces 
 * and it becomes fixed array thats why return type becoming array 
 * 
 * note: if we have a function to check the condition and cover all the use cases including single char
 * null values emty values BLANK VALUES 
 * always its good practice to have null check condition first AND IF WE HAVE BLANK VALUE CHECK DO IT SECOND 
 * because once its comes later 
 * while checking it will throw null pointer exception why because of execution hapening from top to buttom and right to left 
 * and if null value check not coming first and coming later and once we trying to get length of the string 
 * basically we saying null.lenght its null thats why 
 * null value condition first to avoid null pointer exception 
 * 
 * Trying to access index outside string size-> we will get     StringIndexOutOfBoundsException
 *Trying to access any index outside the size of  String split method whic is returm type Array str[]
 * we will get  ArrayIndexOutOfBoundsException
 */

public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is my first java code and I am so happy int ";

		System.out.println(str.length());// 44

		System.out.println(str.charAt(5));
		System.out.println(str.charAt(43));

		System.out.println(str.indexOf('i'));// 1st occurrence of i

		System.out.println(str.indexOf('i', str.indexOf('i') + 1) + " - 2nd occurrence");// 2nd
																	// occurrence
																	// of i

		System.out.println(str.indexOf('i', str.indexOf("happy")+2) +" 4th occurance");
		
		
		System.out.println(str.indexOf("java"));

		System.out.println(str.indexOf("testing"));

		String message = "welcome admin";
		if (message.indexOf("admin") >= 0) {
			System.out.println("user is logged in");
		}
		
		String message2 = "iphone 12 pro added to the card";
		if(message2.indexOf("iphone") >= 0) {
			System.out.println("inside the basket");
		}else {
			System.out.println("add to card failed");
		}
		

		// trim:
		String st = "     hello world    ";
		System.out.println(st.trim());

		System.out.println(st.trim().replace(" ", ""));

		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace("-", "/"));

		// LCASE and UCASE
		String sc = "This Is Java";
		System.out.println(sc.toLowerCase());
		System.out.println(sc.toUpperCase());

		String a = "Hello";
		String b = "selenium";

		System.out.println(a.concat(b));

		// contains:
		String mesg = "hey admin welcome to my portal";
		System.out.println(mesg.contains("admin"));

		// equals:
		String s1 = "This is my code";
		String s2 = "this is my code";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String browser = "CHROME";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("launch chrome");
		}

		// subString:
		String se = "your transaction id is 12345";
		System.out.println(se.substring(0, 10));
		System.out.println(se.substring(0));
		System.out.println(se.substring(5));
		System.out.println(se.substring(se.indexOf("is") + 2).trim());

		// split:
		String data = "Tom;25;IBM;London;9999";
		String emp[] = data.split(";");
		System.out.println(emp.length);
		System.out.println(emp[0]);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		
		
		String registartion = "Jeyhun:33:BankOfAmerica:NewYork:TestingEngineer";
		for(String reg: registartion.split(":")) {
			System.out.println("registartion data - " +reg);
		}
		
		

		String userCred = "admin_admin123";
		String username = userCred.split("_")[0];
		String password = userCred.split("_")[1];

		System.out.println(username);
		System.out.println(password);

		String test = "xXjavaXxXpythonxXXxXRubyxX";
		String testArr[] = test.split("xX");
		// it splited on the basis of xX and before that nothing there thats why it will return blank 
		System.out.println("0-->" + testArr[0]);
		System.out.println("1-->" + testArr[1]);
		System.out.println("2-->" + testArr[2]);
		System.out.println("3-->" + testArr[3]);
		System.out.println("4-->" + testArr[4]);

		String main = "Selenium";
		String rev = "";

		// for(int i=main.length()-1 ; i>=0; i--){
		// rev = rev + main.charAt(i); //m+u+i+n+e+l+e+S
		// }
		// System.out.println(rev);

		char c[] = main.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + main.charAt(i); // m+u+i+n+e+l+e+S
		}
		System.out.println(rev);
		
		StringBuffer obj = new StringBuffer(main);
		System.out.println(obj.reverse());

		
		String reverse = "Texas";
		System.out.println("before reversing " +reverse);
		String rev1 = "";
		for(int i=reverse.length()-1; i>=0; i--) {
			rev1 = rev1+reverse.charAt(i);
		}
		System.out.println("reversed string " +rev1);
		
		//String gg = ""Istanbul" is my favorite "city"";
		String gg = "Istanbul is my favorite city";
		System.out.println("\"\"Istanbul\" is my favorite \"city\"\"");
		
		//  "i would like to be 'master' of java 'developing'"
		String j = "i would like to be master of java developing";
		System.out.println("i would like to be 'master' of java 'developing'");
		
		
		
		System.out.println(reverse(" "));
		System.out.println(reverse("hey you go get some sleep"));
		String xpathcheck = get_xpath("email"); 
		System.out.println(xpathcheck);
	}
	
	public static String get_xpath (String xpathValue) {
		//input[@id="username"]
		String xpath = "input[@id='"+xpathValue+"']";
				return xpath;
	}
	
	
	
	public static String reverse(String strr) {
		System.out.println("before reversing ---->>> " + strr);
		if(strr == null) return  "null string";           
		if(strr.equals(" ")) return "BLANK STRING ";
		if(strr.isEmpty()) return "emthy character";
		if(strr.length()==1) return "single charcter";
		
		
		String revv = "";
		for(int i = strr.length()-1; i>=0; i--) {
			revv = revv + strr.charAt(i);
		}
		System.out.println("after reversing ---->>> " +revv);
		return revv;
	}
	
	
	
	
	
	

}